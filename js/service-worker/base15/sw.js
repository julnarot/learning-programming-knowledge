const CACHE_STATIC_NAME = 'static-v1';
const CACHE_DYNAMIC_NAME = 'dynamic-v1';
const CACHE_INMUTABLE_NAME = 'inmutable-v1';

function cleanCache(cacheName, numItemsToDelete) {
  caches.open(cacheName).then((cache) => {
    return cache.keys().then((cacheItems) => {
      console.log(cacheItems);
      if (cacheItems.length > numItemsToDelete) {
        cache
          .delete(cacheItems[0])
          .then(cleanCache(cacheName, numItemsToDelete));
      }
    });
  });
}

self.addEventListener('install', (event) => {
  const appCachesPromise = [
    caches
      .open(CACHE_STATIC_NAME)
      .then((cache) => cache.addAll(['/', 'css/style.css', 'js/app.js']))
      .catch(console.error),
    caches
      .open(CACHE_INMUTABLE_NAME)
      .then((cache) => cache.add('assets/logo.png'))
      .catch(console.error),
  ];
  event.waitUntil(Promise.all(appCachesPromise));
});

self.addEventListener('fetch', (event) => {
  const checkCacheAndRemote = caches.match(event.request).then((cache) => {
    if (cache) return cache;
    console.log('doesnt exist!!', event.request.url);
    return fetch(event.request).then((resp) => {
      caches.open(CACHE_DYNAMIC_NAME).then((mainCache) => {
        mainCache.put(event.request, resp);
        cleanCache(CACHE_DYNAMIC_NAME, 5);
      });
      return resp.clone();
    });
  });

  event.respondWith(checkCacheAndRemote);
});

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
  const resp_ = fetch(event.request)
    .then((res) => {
      if (!res) {
        return caches.match(event.request);
      }
      caches.open(CACHE_DYNAMIC_NAME).then((cache) => {
        cache.put(event.request, res);
        cleanCache(CACHE_DYNAMIC_NAME, 5);
      });
      return res.clone();
    })
    .catch((err) => {
      return caches.match(event.request);
    });
  event.respondWith(resp_);
});

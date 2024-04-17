const CACHE_STATIC_NAME = 'static-v1';
const CACHE_DYNAMIC_NAME = 'dynamic-v1';
const CACHE_INMUTABLE_NAME = 'inmutable-v1';

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
    return fetch(event.request).then((resp) => {
      caches.open(CACHE_DYNAMIC_NAME).then((mainCache) => {
        mainCache.put(event.request, resp);
      });
      return resp.clone();
    });
  });

  event.respondWith(checkCacheAndRemote);
});

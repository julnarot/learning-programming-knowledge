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
      .then((cache) =>
        cache.addAll([
          '/',
          '/index.html',
          '/assets/logo.png',
          '/css/style.css',
          '/js/app.js',
        ])
      )
      .catch(console.error),
    caches
      .open(CACHE_INMUTABLE_NAME)
      .then((cache) =>
        cache.add(
          'https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css'
        )
      )
      .catch(console.error),
  ];
  event.waitUntil(Promise.all(appCachesPromise));
});

self.addEventListener('fetch', (event) => {
  //provitional
  if (event.request.url.includes('daisyui')) {
    return event.respondWith(caches.match(event.request));
  }

  const staticCache = caches.open(CACHE_STATIC_NAME).then((cache) => {
    fetch(event.request).then((resp) => cache.put(event.request, resp));
    return cache.match(event.request);
  });

  event.respondWith(staticCache);
});

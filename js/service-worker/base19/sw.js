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
          '/assets/no-image.avif',
          '/css/style.css',
          '/js/app.js',
          '/pages/offline.html',
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
  // const respPromise = new Promise((resolve, reject) => {

  const cacheResp = caches.match(event.request).then((cache) => {
    if (cache) return cache;

    console.log('Doesnt Exist', event.request.url);

    return fetch(event.request)
      .then((resp) => {
        caches.open(CACHE_DYNAMIC_NAME).then((newCache) => {
          newCache.put(event.request, resp);
          cleanCache(CACHE_DYNAMIC_NAME, 50);
        });

        return resp.clone();
      })
      .catch(() => {
        if (event.request.headers.get('accept').includes('text/html')) {
          caches.match('/pages/offline.html');
        }
      });
  });

  event.respondWith(cacheResp);
});

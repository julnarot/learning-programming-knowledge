const CACHE_MAIN_NAME = 'cache-v1';

self.addEventListener('install', (event) => {
  event.waitUntil(
    caches
      .open(CACHE_MAIN_NAME)
      .then((cache) => {
        return cache.addAll([
          '/',
          '/index.html',
          'assets/logo.png',
          'css/style.css',
          'js/app.js',
        ]);
      })
      .catch(console.error)
  );
});

self.addEventListener('fetch', (event) => {
  const checkCacheAndRemote = caches.match(event.request).then((cache) => {
    if (cache) return cache;
    console.log('doesnt exist!!', event.request.url);
    return fetch(event.request).then((resp) => {
      return resp;
    });
  });

  event.respondWith(checkCacheAndRemote);
});
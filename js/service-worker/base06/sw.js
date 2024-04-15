self.addEventListener('install', (event) => {
  console.log('[SW]: Installing...');
  event.waitUntil(
    new Promise((resolve, reject) => {
      setTimeout(() => {
        console.log('[SW]: Installed!');
        self.skipWaiting();
        resolve();
      }, 500);
    })
  );
});
self.addEventListener('activate', (event) => {
  console.log('[SW]: Activated');
});
self.addEventListener('fetch', (event) => {
  // console.log('[SW]: Fetching: ', event.request.url);
});

self.addEventListener('sync', (event) => {
  console.log('[SW]: Is Conected!');
  console.log(event);
  console.log(event.tag);
});

self.addEventListener('push', (event) => {
  console.log('Notification received');
});

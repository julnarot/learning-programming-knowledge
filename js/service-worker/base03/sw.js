self.addEventListener('install', (event) => {
  console.log('[SW]: Installing...');
  event.waitUntil(
    new Promise((resolve, reject) => {
      setTimeout(() => {
        console.log('[SW]: Installed!');
        self.skipWaiting();
        resolve();
      }, 2000);
    })
  );
});
self.addEventListener('activate', (event) => {
  console.log('[SW]: Activated');
});

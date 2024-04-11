

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
  console.log('[SW]: Fetching: ', event.request.url);
  const {url, ok} = event.request;
  if (url.includes('reqres.in')) {
    if(!ok) {
      event.respondWith(new Response(JSON.stringify(MOCK_REQRES_USERS),{
        headers: {
          'Content-Type': 'Application/json'
        }
      }))
    }

  }
});



const MOCK_REQRES_USERS = {
  data: [],
  page: 1,
  per_page: 3,
  support: {
    url: '',
    text: '',
  },
  total: 0,
  total_pages: 0,
};
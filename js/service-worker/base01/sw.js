self.addEventListener('fetch', (event) => {
  console.log(event.request.url)
  if (event.request.url.includes('style')) {
    event.respondWith(null)
  } else {
    event.respondWith(fetch(event.request));
  }
});

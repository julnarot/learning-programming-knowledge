self.addEventListener('fetch', (event) => {
  if (event.request.url.includes('Zeratul.png')) {
    event.respondWith(fetch('https://static.wikia.nocookie.net/neoencyclopedia/images/1/1b'));
  }
});

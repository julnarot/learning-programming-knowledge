self.addEventListener('install', (event) => {
  event.waitUntil(
    caches
      .open('cache-v1')
      .then((cache) => {
        return cache.addAll([
          '/index.html',
          'https://static.wikia.nocookie.net/neoencyclopedia/images/1/1b/Zeratul.png',
          'css/style.css',
          'js/app.js',
        ]);
      })
      .catch(console.error)
  );
});

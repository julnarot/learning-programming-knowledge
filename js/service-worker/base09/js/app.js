if (navigator.serviceWorker) {
  navigator.serviceWorker.register('/sw.js');
}

if (window.caches) {
  caches.open('Prueba 01');
  caches.open('Prueba 02');
  caches.open('cache-v1.1').then((cache) => {
    cache.add('/pages/disconect-mode.html');
    cache
      .addAll([
        '/index.html',
        '/css/style.css',
        'https://static.wikia.nocookie.net/neoencyclopedia/images/1/1b/Zeratul.png',
      ])
      .then(() => {
        setTimeout(() => {
          cache.delete('/css/style.css');
        }, 5000);
      });

    cache.match('index.html').then((file) => {
      file.text().then(console.log);
    });
  });

  caches.has('Prueba 9').then(console.log);
}

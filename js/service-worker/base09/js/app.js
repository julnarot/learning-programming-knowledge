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
        '/pages/not-found.html',
        'https://static.wikia.nocookie.net/neoencyclopedia/images/1/1b/Zeratul.png',
      ])
      .then(() => {
        cache.put(
          '/pages/not-found.html',
          new Response(`<h2>Not found :'(</h2>`, {
            headers: {
              'Content-Type': 'text/html',
            },
          })
        );
        setTimeout(() => {
          cache.delete('/css/style.css');
        }, 5000);
      });

    cache.match('index.html').then((file) => {
      file.text().then(console.log);
    });
  });

  caches.has('Prueba 9').then(console.log);
  caches.keys().then(console.log);
}

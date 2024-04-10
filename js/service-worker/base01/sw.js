self.addEventListener('fetch', (event) => {
  if (event.request.url.includes('style.css')) {
    const injectedCssResponse = new Response(
      `
    body {
      background-color: red;
      color: white;
    }
    `,
      {
        headers: {
          'Content-Type': 'text/css',
        },
      }
    );
    event.respondWith(injectedCssResponse);
  }
});

self.addEventListener('fetch', (event) => {
  event.respondWith(
    fetch(event.request).catch(
      () => NO_CONNECTION_HTML()
    )
  );
});

const NO_CONNECTION_HTML = () =>
  new Response(
    `
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>
    body {
      background-color: chocolate;
      color: white;
    }
    </style>
  </head>
  <body>
    
    <h1>Disconnect Mode</h1>
    <hr />
    <p>Sorry, in this moment we cannot connect to interner, please return later</p>
  </body>
</html>

`,
    {
      headers: {
        'Content-Type': 'text/html',
      },
    }
  );

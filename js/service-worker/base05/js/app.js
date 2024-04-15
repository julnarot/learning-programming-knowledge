if (navigator.serviceWorker) {
  navigator.serviceWorker.register('/sw.js').then(resp=> {
    setTimeout(() => {
      resp.sync.register('Sending post ;)!')
      console.log('it was sended')
    }, 5000);
  });
}

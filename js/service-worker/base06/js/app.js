if (navigator.serviceWorker) {
  navigator.serviceWorker.register('/sw.js').then((reg) => {
    Notification.requestPermission((resp) => {
      console.log(resp);
      reg.showNotification("grettings! notifications! ^^!")
    });
  });
}

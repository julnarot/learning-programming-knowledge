// other valid conditional: ('serviceWorker' in navigator)
if (navigator.serviceWorker) {
  navigator.serviceWorker.register('/sw.js');
}

self.addEventListener('install', (event) => {
  console.log('[SW]: Installed');
  self.skipWaiting(); // allow auto activate
});
self.addEventListener('activate',event => {
  console.log('[SW]: Activated')
})
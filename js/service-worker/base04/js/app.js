// other valid conditional: ('serviceWorker' in navigator)
if (navigator.serviceWorker) {
  navigator.serviceWorker.register('/sw.js');
}

fetch('https://reqres.in/apiUNKNOW/users')
.then(resp => resp.json())
.then(console.log);
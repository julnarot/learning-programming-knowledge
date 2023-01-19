const resultado = document.getElementById('resultado');

const { timer } = rxjs;
const { map } = rxjs.operators;

timer(0, 1000).pipe(map(() => new Date().toLocaleString()))
.subscribe(time => resultado.innerText = time);
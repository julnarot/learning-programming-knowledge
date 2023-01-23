const resultado = document.getElementById('resultado');
const { EMPTY, from, of } = rxjs;
const { map, expand, takeWhile } = rxjs.operators;

const txtElement = 'Elemento9_';

const content$ = of(document.body);

content$.pipe(expand(nodo => {
    if(nodo.innerHTML === txtElement || nodo.innerText === txtElement) {
        return of(true);
    }
    else if(!nodo || !nodo.children || nodo.children.length === 0) {
        return EMPTY;
    }

    return from([...nodo.children]);
}), takeWhile(val => val !== true, true))
.subscribe(val=>{
    console.log("->",val)
})


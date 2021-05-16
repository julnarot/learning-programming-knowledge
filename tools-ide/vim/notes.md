### mover cursor
l -> mover a derecha
h -> mover a la izquierda
j -> mover hacia abajo
k -> mover hacia arriba
e-> mover al final de la palabra
b-> mover al prinsipio de la palabra

###cambiar a modo editar
i -> cambiar a modo editar antes de la  posicion del cursor
a -> cambiar a modo editar despues de la posicion del cursor
A -> cambiar a modo editar al final de linea

### Elimar texto
x -> Elimina en la posicion del cursor

### Guardar 
[ESC]
:w -> guardar(write)
:q -> salir(quit)
:wq -> guardar y salir



### navegacion y  moverse entre archivos

gd -> ir a la definicion de la palabra en el cursor
gf -> ir a la definicion en el archivo de la paralabra en el cursor 

ctrl + o -> navegar hacia atras
ctrl + i -> navegar hacia adelante
### elimar caracteres
dw -> Eliminar palabra (delete word)
d + shift + $ -> Eliminar desde el cursor hasta el final de la linea
### Deshacer
u -> deshacer (undo)
### Rehacer
ctrl + r -> Rehacer

#Operadores y movimientos
de -> eliminar palabra desde la posicion del cursor hacia adelante
db -> eliminar palabra desde la posicion del cursor hacia atras
d6w -> eliminar 6 palabras desde el cursor
d5b -> eliminar 5 palabras desde el cursor hacia atras

# eliminar cortar pegar ordenar
dd -> cortar
p -> pegar despues de la linea del cursor
P -> pegar antes de la linea del cursor
x -> cortar en la posicion del cursori
# Remplazar y operador de cambio
r -> remplazar el valor en el que se encuentra el cursor

cw -> cambiar palabra desde la posicion del cursor (change word)
ciw -> cambiar palabra completa (change inner word)
# Salto de lineas y busqueda
gg ->comienzo del archivo
G -> final del archivo
16G -> ir a la linea 16
### buscando
/texto -> buscar 'texto' hacia abajo del cursor
?texto -> buscar 'texto' hacia arriba del cursor
	n -> para posicionar el cursor en la siguiente palabra encontrada
	N -> para posicionar el cursor en la anterior palabra encontrada
	
### salto de parentesis y remplazo de cadenas

shift + % -> para navegar posicion entre (), {}, []
0 -> ir al inicio de la linea
shift + $  -> ir al fin de la linea

:s/texto/nuevoTexto -> remplazar texto por nuevoTexto a la primera ocurrencia despues del cursor
:s/texto/nuevoTexto/g -> remplazar texto por nuevoTexto a  todas las ocurrencia en la linea
:%s/texto/nuevoTexto/gc -> remplazar texto por nuevoTexto en todo el fichero pero solicitando confirmacion con opciones

### abri linea, remplazar ,copiar y pegar
o -> abrir nueva linea por debajo del cursor
O -> abri nueva linea por encima del cursor
shift + r -> cambiar en modo remplazo desde la posicion del cursor
v -> cambiar a modo VISUAL
	tecla derecha para seleccionar desde la ubicacion del cursor
	y -> copiar

### Configurar






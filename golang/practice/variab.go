package main

import "fmt"

func main() {
	var mensaje  string = "Mensaje basico"
	msn := "Hola que tal con mensajes"

	fmt.Println(mensaje);
	fmt.Println(msn);
	i := 100
	j := 200
	fmt.Println(i+j)
	tiene := true
	notiene := false
	boolval := (tiene && !notiene)
	fmt.Print(boolval)

}
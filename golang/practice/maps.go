package main

import "fmt"

func main() {

	person := make(map[string]int)  // mapping string to  intenget

	person["age"] = 29

	fmt.Println(person)
	fmt.Println(person["age"])


}

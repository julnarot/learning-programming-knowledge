package main

import "fmt"

type animal interface {
	move() string
}

type dog struct{}

type fish struct{}

type bird struct{}

func (dog) move() string {
	return "Im a Dog and iam walking"
}

func (fish) move() string {
	return "Im a fish  and iam swimming"
}

func (bird) move() string {
	return "Im a Bird and iam Flying"
}

func moveAnimal(a animal) {
	fmt.Println(a.move())
}
func main() {

	d := dog{}
	b := bird{}
	f := fish{}
	moveAnimal(d)
	moveAnimal(b)
	moveAnimal(f)

}

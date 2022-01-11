package main

import "fmt"

type dog struct{}

func (dog) walk() string {
	return "Im a Dog and iam walking"
}

type fish struct{}

func (fish) swim() string {
	return "Im a fish  and iam swimming"
}

type bird struct{}

func (bird) fly() string {
	return "Im a Bird and iam Flying"
}

func moveDog(d dog) {
	fmt.Println(d.walk())
}
func moveFish(f fish) {
	fmt.Println(f.swim())
}
func moveBird(b bird) {
	fmt.Println(b.fly())
}
func main() {

	d := dog{}
	b := bird{}
	f := fish{}
	moveDog(d)
	moveBird(b)
	moveFish(f)

}

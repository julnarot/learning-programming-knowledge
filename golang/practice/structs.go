package main

import (
	"bufio"
	"fmt"
	"os"
)

type calc struct {
}

func (calc) sum(a int, b int) int {
	return a + b
}
func (calc) rest(a int, b int) int {
	return a + b
}

func main() {
	fmt.Println("Insert Value: ")
	cat := scanv()
	fmt.Println(cat)
	other := calc{}
	_sum := other.sum(1, 3)
	_res := other.rest(4, 2)
	fmt.Print(_sum)
	fmt.Print(_res)

}

func scanv() string {
	scan := bufio.NewScanner(os.Stdin)
	scan.Scan()
	return scan.Text()
}

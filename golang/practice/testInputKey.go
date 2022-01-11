package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
	"time"
)

func main() {
	scan := bufio.NewScanner(os.Stdin)

	fmt.Print("Insert Name: ")
	scan.Scan()
	name := scan.Text()
	//fmt.Println(txt)

	fmt.Print("Insert LastName: ")
	scan.Scan()
	lastname := scan.Text()

	// printing name and lastname

	fmt.Println("Insert Year Birthday: ")
	scan.Scan()
	t := scan.Text()
	yearUser, _ := strconv.Atoi(t) // white code
	currentYear, _, _ := time.Now().Date()


	fmt.Println("Tell us something about yourself: ")
	scan.Scan()
	text := scan.Text()
	worldText := strings.Split(text, " ")

	fmt.Println("Person: "+name + ", " + lastname)
	fmt.Println("Age: " + strconv.Itoa(currentYear-yearUser) + " Years old")
	fmt.Println("Your information has [" + strconv.Itoa(len(worldText)) + "] Words")

}

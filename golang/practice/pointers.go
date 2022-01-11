package main

func main() {
	year := 25
	println(year)

	println(&year)
	y := &year // check referency

	println(y)
	println(*y) //get from references

	//setYear(year)
}

func setYear(ny int) {
	println(&ny)
	ny = 100
}

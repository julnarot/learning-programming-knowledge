package main

import (
	"fmt"
	"io"
	"net/http"
)

type writter struct{}

func (writter) Write(p []byte) (int, error) { // We Need Inplement [Write] for to use htttp GET
	fmt.Println(string(p))
	return len(p), nil
}

func main() {
	resp, err := http.Get("https://google.com")
	if err != nil {
		fmt.Println(err)
	}
	wr := writter{}
	io.Copy(wr, resp.Body) // here is necesary implement Write
	//fmt.Println(resp)
	//fmt.Println(resp.Body)

}

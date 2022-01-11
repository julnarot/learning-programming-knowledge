package main

import (
	"encoding/json"
	"fmt"
	"net/http"
)

func HandlerRoot(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello Handle Root")
}

func HandlerApi(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "API ENdopont")
}
func PostRequest(w http.ResponseWriter, r *http.Request) {
	decode := json.NewDecoder(r.Body)
	var metadata MetaData
	err := decode.Decode(&metadata)
	if err != nil {
		fmt.Fprintf(w, " USER REQUEST EROR%v", err)
	}
	//fmt.Println(metadata["name"])
	fmt.Fprintf(w, "Payload%v\n", metadata)
	fmt.Println(metadata)
}
func UserPostRequest(w http.ResponseWriter, r *http.Request) {
	decode := json.NewDecoder(r.Body)
	var user User
	err := decode.Decode(&user)
	if err != nil {
		fmt.Fprintf(w, " USER REQUEST EROR%v", err)
		return
	}
	fmt.Println(user)


	fmt.Fprintf(w, "Payload%v\n", user)
}
// del monte valeria
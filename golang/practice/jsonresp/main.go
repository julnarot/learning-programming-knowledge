package main

import (
	"encoding/json"
	"fmt"
	"net/http"
)

type Profile struct {
	Name    string
	Hobbies []string
}

func main() {
	http.HandleFunc("/", foo)
	http.ListenAndServe(":3001", nil)
}

func foo(w http.ResponseWriter, r *http.Request) {
	profile := Profile{"Raul", []string{
		"Listening to music", "Lear new programing languages",
	}}

	js, err := json.Marshal(profile)

	if err != nil {
		http.Error(w, err.Error(), http.StatusInternalServerError)
	}
	fmt.Println(profile)
	w.Header().Set("Content-Type", "application/json")
	w.Write(js)
}

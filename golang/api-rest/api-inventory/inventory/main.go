package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"net/http"
)

func main() {
	http.HandleFunc("/", HandleGetItems)
	http.HandleFunc("/update", HandleUpdateItems)
	http.ListenAndServe(":8080", nil)
}

func HandleGetItems(w http.ResponseWriter, r *http.Request) {

	items := getItems()
	itemsBytes, err := json.Marshal(items)
	if err != nil {
		panic(err)
	}
	w.Write(itemsBytes)
}

func HandleUpdateItems(w http.ResponseWriter, r *http.Request) {

	if r.Method == "POST" {
		body, err := ioutil.ReadAll(r.Body)
		if err != nil {
			panic(err)
		}
		var items []item
		err = json.Unmarshal(body, &items)
		if err != nil {
			w.WriteHeader(400)
			fmt.Fprintf(w, "Bad request")
		}

		saveItems(items)
	} else {
		w.WriteHeader(405)
		fmt.Fprintf(w, "Method not supported!")
	}
}

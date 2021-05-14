package main

import (
	"encoding/json"
	"io/ioutil"
)

type item struct {
	Id          string
	Title       string
	Description string
	ImageUrl    string
	Url         string
}

func getItems()(items []item) {
	fileByte, err := ioutil.ReadFile("./items.json")

	if err != nil {
		panic(err)
	}

	err = json.Unmarshal(fileByte, &items)
	if err != nil {
		panic(err)
	}
	return items
}

func saveItems(items []item) () {
	videoBytes, err := json.Marshal(items)

	if err != nil {
		panic(err)
	}

	err = ioutil.WriteFile("./items-updated.json", videoBytes, 0644)
	if err != nil {
		panic(err)
	}

}

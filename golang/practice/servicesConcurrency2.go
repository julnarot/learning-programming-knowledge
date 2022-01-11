package main

import (
	"fmt"
	"net/http"
	"time"
)

func main() {

	timeIni := time.Now()
	channel := make(chan string) // we have string paramets throud the channels
	servers := []string{ // slide
		"https://rauljhonatan.com",
		"https://alwaysdata.com",
		"https://google.com",
		"https://facebook.com",
	}

	i := 0
	for {
		if i > 2 {
			break
		}
		for _, serv := range servers {
			go checServer(serv, channel) // create new thread
		}
		time.Sleep(1 * time.Second)
		fmt.Println(<-channel)
		i++
	}

	timeTransc := time.Since(timeIni)

	fmt.Println("Time Execution: \n", timeTransc)

}

func checServer(server string, chann chan string) {
	_, err := http.Get(server)
	if err != nil {
		//fmt.Println(server, ", server is not available")
		chann <- server + ", server is not available[Chanel]"
	} else {
		//fmt.Println(server, ", server is available")
		chann <- server + ", server is available[Chanel]"
	}
}

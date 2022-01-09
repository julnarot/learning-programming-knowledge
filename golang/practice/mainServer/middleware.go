package main

import (
	"fmt"
	"log"
	"net/http"
	"time"
)

func CheckAuth() Middleware {
	return func(f http.HandlerFunc) http.HandlerFunc {
		return func(w http.ResponseWriter, r *http.Request) {

			flag := true
			fmt.Println("Eching middlewareauth")
			if flag {
				f(w, r)
			} else {
				return
			}
		}
	}
}

func Logging() Middleware {
	return func(f http.HandlerFunc) http.HandlerFunc {
		return func(w http.ResponseWriter, r *http.Request) {
			start := time.Now()
			// differ se ajecuta hasta el final like to funtion annonim
			defer func() {
				log.Println(r.URL.Path, time.Since(start))
			}()
			f(w, r)
		}
	}
}

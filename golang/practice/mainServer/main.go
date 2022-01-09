package main

func main() {
	server := NewServer(":3000")
	server.handle("GET", "/", HandlerRoot)
	server.handle("GET", "/api", server.AddMiddleware(HandlerApi, CheckAuth(), Logging()))
	server.handle("POST", "/create", PostRequest)
	server.handle("POST", "/user", UserPostRequest)
	_ = server.Listen()
}

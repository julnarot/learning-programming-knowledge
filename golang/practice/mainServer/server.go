package main

import "net/http"

type Server struct {
	port   string
	router *Router
}

func NewServer(port string) *Server {
	return &Server{
		port:   port,
		router: NewRouter(),
	}
}

func (s *Server) handle(method string, path string, handler http.HandlerFunc) {
	_, exist := s.router.rules[path]
	if !exist {
		s.router.rules[path] = make(map[string]http.HandlerFunc)
	}
	s.router.rules[path][method] = handler
}

// defineing with  three poitns.... because this can su much
func (s *Server) AddMiddleware(f http.HandlerFunc, middlewars ...Middleware) http.HandlerFunc {
	for _, m := range middlewars {
		f = m(f)
	}
	return f
}

func (serv *Server) Listen() error {
	http.Handle("/", serv.router)
	err := http.ListenAndServe(serv.port, nil)

	if err != nil {
		return err
	}
	return nil
}

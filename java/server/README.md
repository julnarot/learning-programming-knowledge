# Server api application

Example developlent spring bpot application withmysql db on docker container
### Config

### create file: ``production.env`` in root project with next params:

   ```env
    MYSQL_DATABASE=nextcloud 
    DB_USER=root
    MYSQL_ROOT_PASSWORD=even-more-secure.password
```

## Run application

### launch db
  ```sh
  docker compose up
  ```
  
### run application
  ```sh
  ./mvnw spring-boot:run
  ```



### go to page [http://localhost:8080/server/list](http://localhost:8080/server/list)

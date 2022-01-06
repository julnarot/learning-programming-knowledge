### launch db
  ```sh
  docker compose up
  ```
### create file: ``production.env`` in root project with next params:

   ```env
    MYSQL_DATABASE=nextcloud 
    DB_USER=root
    MYSQL_ROOT_PASSWORD=even-more-secure.password
```
### go to page [http://localhost:8080/server/list](http://localhost:8080/server/list)
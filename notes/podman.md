## Build & Run
```bash
sudo podman-compose up --build -d
```
## other commands
```
podman-compose ps
podman-compose up -d
podman-compose stop
podman-compose down --volumes
podman-compose logs --follow [container_name]
```


mkdir php-apache-demo
cd php-apache-demo
mkdir src
echo "<?php echo "<h3>Hello World!!!</h3>"; ?>" > index.php

create  Dockerfile and add:

```bash
# Use the image with PHP 7.2 and Apache as base image 
FROM php:7.2-apache

# Copy the content of the current directory to /var/www/html in the image
COPY src /var/www/html

# Open up port 80 in the container
EXPOSE 80
```
### build image
```bash
sudo podman build -t hello-world .

```

### check images

```bash
sudo podman images
```

## run application

### run hello-world images

```bash
sudo podman run -it  -p  80:80 hello-world
```

### run hello-world image in background

```bash
sudo podman run -d -p 80:80 hello-world
```

go to [localhost](http://localhost)


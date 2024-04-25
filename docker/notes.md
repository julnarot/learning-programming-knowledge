- Execute `docker port [CONTAINER_ID]`
- Get IpAddres and Port from result command executed
- Use telnet on host terminal `telnet [IP] [PORT]`

example
```bash
container-bash$ docker port oracle11
1521/tcp -> 0.0.0.0:666
1521/tcp -> [::]:666
```

check on telnet and pres ctrl+c for stop

```bash
host$ telnet localhost 666
Trying 127.0.0.1...
Connected to localhost.
```

Check ip of container

```bash
container$ docker inspect -f "{{ .NetworkSettings.IPAddress }}" [CONTAINER_ID]

172.2.0.1
```

# Build custom container

## Creating node container with module http-server



# utils commands

## usin node http-server container for serve current folder on port 8885



running current host path temporally
```bash
docker run --rm -p 8885:8080 --name here-http -v "$(pwd)":/app node-lts-http http-server /app

```
Add flag `-d` for running in mode *desatending*
```bash
docker run --rm -d -p 8885:8080 --name here-http -v "$(pwd)":/app node-lts-http http-server /app
```
> dont forget that you need a container with node and `http-server` module installed


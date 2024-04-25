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

- create container with dns `8.8.8.8` and mode `bash` with lts node image  `node:latest` like next example

```bash
julnarot@aiur$ docker run --dns 8.8.8.8 -it --name node-lts-http-server node:latest /bin/bash

root@b7237dd86f54:/# npm install -g http-server

added 46 packages in 24s

15 packages are looking for funding
  run `npm fund` for details
npm notice 
npm notice New patch version of npm available! 10.5.0 -> 10.5.2
npm notice Changelog: https://github.com/npm/cli/releases/tag/v10.5.2
npm notice Run npm install -g npm@10.5.2 to update!
npm notice 

root@b7237dd86f54:/# exit
exit

```

- check container created with `docker ps -a`
```bash
docker ps -a
CONTAINER ID   IMAGE        COMMAND                  CREATED         STATUS                      PORTS                    NAMES
b7237dd86f54   node:latest  "docker-entrypoint.s…"   5 minutes ago   Exited (0) 37 seconds ago                          node-lts-http-server
```
> check the container was created with container name `node-lts-http-server`
- commiting recente container with `docker commit node-lts-http-server node-lts-http-server` like these

```bash
julnarot@aiur$ docker commit node-lts-http-server node-lts-http-server
sha256:b244f2005a34dd8b509c178135f2f91b07164d66d936bfe57dd550747f6222e
```



# utils commands

## usin node http-server container for serve current folder on port 8885

running current host path temporally
```bash
docker run --rm -p 8885:8080 --name here-http -v "$(pwd)":/app node-lts-http-server http-server /app

```
Add flag `-d` for running in mode *desatending*
```bash
docker run --rm -d -p 8885:8080 --name here-http -v "$(pwd)":/app node-lts-http-server http-server /app
```
> dont forget that you need a container with node and `http-server` module installed


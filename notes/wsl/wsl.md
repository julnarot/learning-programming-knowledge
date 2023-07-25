# WSL Notes
## Docker
### After install docker on ubuntu setup:
```bash
getent group | cut -d: -f3 | grep -E '^[0-9]{4}' | sort -g

getent group | grep 36257 || echo "Yes, that ID is free"

sudo sed -i -e 's/^\(docker:x\):[^:]\+/\1:36257/' /etc/group

sudo groupmod -g 36257 docker

DOCKER_DIR=/mnt/wsl/shared-docker
mkdir -pm o=,ug=rwx "$DOCKER_DIR"
chgrp docker "$DOCKER_DIR"
```
### Start Docker daemon
```bash
sudo dockerd
```

### Open in other terminal session and execute

```
export DOCKER_HOST="unix:///mnt/wsl/shared-docker/docker.sock"

docker run --rm hello-world
```




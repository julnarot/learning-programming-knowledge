#!/bin/bash

N=${1:-3}

sudo docker rm -f hadoop-master &> /dev/null
echo "start hadoop-master container..."
sudo docker run -itd \
		-v $(pwd)/proc-app:/home \
                --net=hadoop \
                -p 50070:50070 \
                -p 8088:8088 \
                --name hadoop-master \
                --hostname hadoop-master \
                uracilo/hadoop &> /dev/null


i=1
while [ $i -lt $N ]
do
	sudo docker rm -f hadoop-slave$i &> /dev/null
	echo "start hadoop-slave$i container..."
	sudo docker run -itd \
	                --net=hadoop \
	                --name hadoop-slave$i \
	                --hostname hadoop-slave$i \
	                uracilo/hadoop &> /dev/null
	i=$(( $i + 1 ))
done 

# Ingresar a nuestro contenedor master
sudo docker exec -it hadoop-master bash

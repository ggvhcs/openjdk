# --- ***                                         *** --- #
# Java Home Develop Environment with Docker, openjdk 17   #
# from OS Linux Mint 21.                                  #
# --- ***                                         *** --- #

Index:
--- 1 --- download image debian:12 from hub docker ---
--- 2 --- create the Dockerfile file --- 
--- 3 --- create image from debian 12 ---
--- 4 --- test the image created ---
--- 5 --- run sshd service and pass to user root.
--- 6 --- allow user root sign on ssh.
--- 7 --- enside container test the compiler.
--- 8 --- join container with vscode with ssh.

--- java biblio to learn ---
https://introcs.cs.princeton.edu/java/11hello/

--- youtube ---
https://youtu.be/CXL-NVxZnfY

--- github repository ---

Develop Enviroment:
---
Linux Mint 21.2 Mate x64.
Docker version 24.0.7, build 24.0.7-0ubuntu2~22.04.1
git version 2.34.1
Github Desktop version 3.2.0-linux1 (x64)
Visual Studio Code version 1.96.4
---

--- 1 --- download image debian:12 from hub docker ---
$ sudo docker pull debian:12 // download docker image.
$ sudo docker images |grep debian // check if download is ok.

cd ~/Documents/GitHub/docker/java/openjdk
$ sudo chmod 777 -Rvf ../openjdk
$ sudo chown nobody:nogroup -Rvf ../openjdk

--- 2 --- Create the Dockerfile file ---
$ touch Dockerfile
$ nano Dockerfile
$ cat Dockerfile
---
FROM debian:12

RUN apt update
RUN apt install -y default-jdk
RUN apt install -y default-jre 
RUN apt install -y openssh-server
RUN apt install -y nano

EXPOSE 22

RUN mkdir /app
WORKDIR /app
---

--- 3 --- create image from debian 12 ---
$ sudo docker build -t debian-openjdk17:develop .
$ sudo docker images |grep openjdk17
---
debian-openjdk17   develop   ee918f7f25b0   8 hours ago         815MB
---

--- 4 --- !test the image created * !container delete on exit *---
$ sudo docker run --rm -it \
-v ~/Documents/GitHub/docker/java/openjdk:/app \
--interactive --tty --entrypoint /bin/bash debian-openjdk17:develop
debian-openjdk17:develop /bin/bash

--- finally we create the java develop container.
$ sudo docker run -p 22:22 \
--net bridge \
-v ~/Documents/GitHub/docker/java/openjdk:/app \
-v ~/Documents/GitHub/docker/java/openjdk/ssh:/etc/ssh \
-v ~/Documents/GitHub/docker/java/openjdk/code:/root \
-it debian-openjdk17:develop /bin/bash

--- 5 ---- !run sshd service and pass to user root.
! Important this, we need be sure the service always be runing.
$ /etc/init.d/ssh start && /etc/init.d/ssh status
$ passwd root

--- 6 --- !allow user root sign on ssh. !important for connect from vscode.
$ cat /etc/ssh/sshd_config |grep PermitRootLogin
---
PermitRootLogin yes
---

--- 7 --- !enside container test the compiler.
$ java --version
$ javac -version

$ nano HelloWorld.java // create java file.
$ javac HelloWorld.java //compile the file.
$ java HelloWorld // execute Hello World

--- 8 --- !join container with vscode with ssh.

--- !we need to know what is container ip address.
$ sudo docker inspect -f \
'{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' \
container-id-number

--- !we need have ssh extensions installed.
--- ping the ip addres from host 
--- connect vscode and the container.

# --- ***                                         *** --- #
# Java Basic Course with Docker, openjdk 17   #
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

--- youtube ---

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

$ cd ~/Documents/GitHub/docker/java/openjdk/basic_course
$ sudo chmod 777 -Rvf ../basic_course
$ sudo chown nobody:nogroup -Rvf ../basic_course

--- 2 --- Create the Dockerfile file ---

--- 3 --- create image from debian 12 ---

--- 4 --- !test the image created * !container delete on exit *---

--- finally we create the java develop container.
$ sudo docker run -p 22:22 -rm \
--net bridge --name ojdk-develop \
-v $(pwd)/app:/app \
-v $(pwd)/ssh:/etc/ssh \
-v $(pwd)/code:/root \
-it debian-openjdk17:develop /bin/bash

--- 5 ---- !run sshd service and pass to user root.
! Important this, we need be sure the service always be runing.
$ /etc/init.d/ssh restart && /etc/init.d/ssh status
---
sshd is running.
---

$ passwd root
---
New password: 
Retype new password: 
passwd: password updated successfully
---

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
---
172.17.0.3
---

--- !we need have ssh extensions installed.
--- ping the ip addres from host ---
$ ping 172.17.0.3
---
PING 172.17.0.3 (172.17.0.3) 56(84) bytes of data.
64 bytes from 172.17.0.3: icmp_seq=1 ttl=64 time=0.197 ms
64 bytes from 172.17.0.3: icmp_seq=2 ttl=64 time=0.073 ms
---

--- connect vscode and the container.

--- bibliography ---
https://introcs.cs.princeton.edu/java/12types/
https://introcs.cs.princeton.edu/java/13flow/
https://introcs.cs.princeton.edu/java/14array/
https://introcs.cs.princeton.edu/java/15inout/
https://introcs.cs.princeton.edu/java/16pagerank/
https://introcs.cs.princeton.edu/java/21function/
https://introcs.cs.princeton.edu/java/22library/
https://introcs.cs.princeton.edu/java/23recursion/
https://introcs.cs.princeton.edu/java/24percolation/
https://introcs.cs.princeton.edu/java/31datatype/
https://introcs.cs.princeton.edu/java/32class/
https://introcs.cs.princeton.edu/java/33design/
https://introcs.cs.princeton.edu/java/34nbody/

https://introcs.cs.princeton.edu/java/41analysis/
https://introcs.cs.princeton.edu/java/42sort/
https://introcs.cs.princeton.edu/java/43stack/
https://introcs.cs.princeton.edu/java/44st/
https://introcs.cs.princeton.edu/java/45graph/
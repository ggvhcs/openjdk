FROM debian:12

RUN apt update
RUN apt install -y default-jdk
RUN apt install -y default-jre 
RUN apt install -y openssh-server
RUN apt install -y nano

EXPOSE 22

RUN mkdir /app
WORKDIR /app

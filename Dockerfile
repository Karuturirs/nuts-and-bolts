#A JDK 11 with MAVEN
FROM maven:3.6.0-jdk-11-slim

MAINTAINER Ravi Sankar Karuturi(github/karuturirs)

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git

# Set the working directory to /app
WORKDIR /app/nuts-and-bolts/

# Copy the current directory contents into the container at /app
COPY . /app/nuts-and-bolts/

CMD cd /app/nuts-and-bolts/;

EXPOSE 9080

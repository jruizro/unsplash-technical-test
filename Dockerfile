FROM openjdk:11-jdk
LABEL maintainer=unsplash-technical-test artifact=unsplash-technical-test

ARG SECRETKEY
ENV SECRETKEY=${SECRETKEY}

EXPOSE 8000
ENV USER root

ADD build/libs/unsplash-technical-test-1.0.jar unsplash-technical-test.jar
ENTRYPOINT ["java","-jar","/unsplash-technical-test.jar", "--jasypt.encryptor.password=${SECRETKEY}"]

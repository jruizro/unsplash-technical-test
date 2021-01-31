# Unsplash Collection Filter API Client

### Service Description

This microservice implements a service that returns [unsplash collections](https://unsplash.com/documentation#list-collections) that matches with concrete filter in some specific fields.

Service only have one end point (See API Swagger2 Documentation [here](/swagger-ui.html#/collections-controller/getCollectionsFilteredUsingGET).):
>  GET /collection/all

### To Run Microservice

Execute commands:
```
gradlew clean build
```
```
java -jar build/libs/unsplash-technical-test-1.0.jar --jasypt.encryptor.password={SECRET_SALT_KEY}
```

*NOTE: **SECRET_SALT_KEY** is mandatory to decrypt Unsplash ClientId key that is not allowed to be public*

### To Run Docker

Execute commands:

```
docker pull joaquinaltran/unplashclient:codetest```
```
```
docker run -it -p 8000:8080 joaquinaltran/unplashclient:codetest
```
### Design Notes

DDD (Domain Driven Design) approach.

- ```Application Service Layer```: Use Case `get Collections filtered`
- ```Model Layer```: Aggregate Root Entity -> `CollectionFiltered`
- ```Infrastructure/Framework Layer```

### Technical Information

Frameworks and libs used:

- JAVA 11
- Spring Boot 2.4.2
- JUnit 5
- Swagger2 API Documentation
- Jasypt Encryption
- Gson JSON

### Repository Links

- [GitHub Repository](https://github.com/jruizro/unsplash-technical-test)
- [DockerHub Docker Repository](https://hub.docker.com/repository/docker/joaquinaltran/unplashclient)

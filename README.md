# Unsplash Collection Filter API Client

### Service Description

This microservice implements a service that returns [unsplash collections](https://unsplash.com/documentation#list-collections) that matches with concrete filter in some specific fields.

Service only have one end point (See API Swagger2 Documentation [here](/swagger-ui.html#/collections-controller/getCollectionsFilteredUsingGET).):
>  GET /collection/all

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

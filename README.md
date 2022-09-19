
# Country codes app

A Spring Boot backend application that given a specefic country code returns the country name, continent, population, life expectancy and it's official language.


## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

### Docker 
The application uses docker to run a postgress docker container databases on port 8081.

You can run a Docker container with this command  :

`docker run -d -p 8081:5432 ghusta/postgres-world-db:2.6`

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Documentation
## GET
`get country data` [http://localhost:8080/{code}](#get-1billingretrieve-billing-datajson) 

## Example 
http://localhost:8080/ARG

### response

{

    "name": "Argentina",
    "continent": "South America",
    "population": 37032000,
    "life_expectancy": 75,
    "country_language": "Spanish"
}

# Spring Boot Noob Note

## Maven

### Directory
- **target**  
    processed stuff: artifacts, jar, war, etc
- 
### Build
`mvnw [options] [<goal(s)>] [<phase(s)>]`

**Phase**
- clean
- default
- site

`mvnw clean`
- pre-clean  
    hook for before cleaning
- clean  
    Does the actual cleaning
- post-clean
    Hook for after cleaning

`mvnw [default]`
- compile  
    Compile your code into bytecode
- test  
    Run unit test
- package  
    Create jar or war file
- verify  
    Run check & integration tests

### Run Application
`mvnw spring-boot:run`

## Environment
[Link to Common Application Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)  
Default file: `application.properties`


# Spring Framework simple CRUD

## Table of Contents
- [Java Basics](#java-basics)
- [Java Collections](#java-collections)
- [Dependency Management](#dependency-management)
    - [Maven](#maven)
- [Spring Framework](#spring-framework)
- [Usage](#usage)


## Java Basics
- Variables and Data Types
- Control Flow Statements (if, switch, loops)
- Functions and Methods
- Object-Oriented Programming (OOP) concepts (classes, objects, inheritance, polymorphism)

## Java Collections
Java Collections framework is used to store, retrieve, manipulate, and communicate aggregate data. Key components include:
- **List**: An ordered collection (e.g., `ArrayList`, `LinkedList`)
- **Set**: A collection that does not allow duplicate elements (e.g., `HashSet`, `TreeSet`)
- **Map**: An object that maps keys to values (e.g., `HashMap`, `TreeMap`)
- **Queue**: A collection used to hold multiple elements prior to processing (e.g., `LinkedList`, `PriorityQueue`)

### Examples
- **ArrayList Example**:
  ```java
  List<String> students = new ArrayList<>();
  students.add("Alice");
  students.add("Bob");

## Dependency Management
### Maven
- Dependancy management using `pom.xml`
- Build lifecycle management
- Plugin management for spring framework

## Spring Framework
in this project we using some framework
- **Spring Web Starter :** This dependency adds support for building web applications, including RESTful APIs using Spring MVC.
- **Spring Boot DevTools :** feature: Live Reload)
- **Spring Data JPA :** database interaction, less boilercode than default jdbc, and more feature like can add schema(many to many, many to one, etc
- **OpenAPI Swagger** : Swagger UI Automate generation for API Documentation `http://localhost:8080/swagger-ui/index.html`
- **PostgreSQL Driver** : PostgreSQL JDBC driver enabling application to connect a PostgreSQL database
- **Lombok** : helps reduce boilerplate code by providing annotations for generating getters, setters, and other common methods.

## Usage
To run the application, follow these steps:
1. Clone the repository:
 ```bash
  git clone https://github.com/nandaarafi/spring-crud.git
  cd spring-crud
```
2. Build postgres docker container
```bash
docker-compose up
```

3. Build the project using Maven or Gradle
```Maven
mvn clean install
```
4. Run the application
```Maven
mvn spring-boot:run
```
# Spring Boot Demo
A sample project to demonstrate Spring Boot application using Spring Data JPA and other features.

# Packaging the application
Packaging to JAR can be done from the project folder by opening a terminal and running Maven (mvn for *nix systems and mvnw for Windows systems) commands:
 - mvnw clean install

# Running the application
 - The application can be directly run by any IDE (tested with IntelliJ).
 - The packaged JAR can be run using "java -jar <jar_name>" from the terminal.

# H2 database
 - This application can connect to H2 database pointing to file source: "<User's Home Directory>\test_database\test".
 - H2 console can be accessed from the URL: http://localhost:8081/h2-console.
 - Sample SQL script is kept at <project's root directory>\src\main\resources\data.sql. Initial schema can be created in H2 database after connecting to H2 console.

# Tutorial Video
In progress...


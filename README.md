# Getting Started

### Requirements
* Java version 1.8 
* Apache Maven version 3.6.0

### Configuration file
Application.properties files is the configuration file. 
This file can be found at src/resources. 

Belore are the different configuration properties

| Properties | Description | Example |
| ---------- | ----------- | -------- |
| spring.datasource.url | Configure a new Database URL | jdbc:h2:~/test |
| spring.datasource.driverClassName | Configure a new database Driver | org.h2.Driver |
| spring.datasource.username | Configure the Database username | admin |
| spring.datasource.password | Configure the Database password | admin |


### Compile and run the applicaion from command prompt
* mvn clean package
* mvn spring-boot:run

Open your favourite browser or postman and go to the url http://localhost:8080

### Compile and run the jar file
When the application is compiled using the maven command test cases are executed and once the test cases pass a package(jar file) is created.
This jar can be executed with the below command
* mvn clean package
* java -jar target/vehicleRegistration-0.0.1-SNAPSHOT.jar

Open your favourite browser or postman and go to the url http://localhost:8080



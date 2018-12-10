# Spring Boot Demo
### How to run
1. Clone the repository:
```
git clone https://github.com/alexmancheno/Spring-Boot-Demo.git
```

2. Change into the root of the application:
```
cd Spring-Boot-Demo
```

3. Run the application using Maven:
```
mvn spring-boot:run
```

4. Test your app by visiting the home page of the app:
```
http://localhost:8080
```

5. Test the RESTful controller that returns JSON:
```
http://localhost:8080/greeting?name=John&major=ComputerScience
```

**Note:** if you don't have Maven installed, use the Maven wrapper instead. Example:
```
./mvnw 
```

If you need to grant permissions on Mac for the Maven wrapper:
```
chmod a+x mvnw
```

### How to create and run JAR file
1. Create the JAR using Maven:
```
mvn clean package
```

2. Run the JAR file:
```
java -jar target/demo-0.0.1-SNAPSHOT.jar
```
EXPLAINTION FOR APP.PROP CONFIGURATIONS

spring.datasource.url= jdbc:mysql://localhost:3306/crudApp?createDatabaseIfNotExist=true: This line specifies the URL to connect to a MySQL database running on your local machine. It mentions the database name "crudApp," and the option "createDatabaseIfNotExist" is set to "true," meaning that if the "crudApp" database does not exist, Spring Boot will try to create it.

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver: This line specifies the JDBC driver class for MySQL, which Spring Boot will use to connect to the database.

spring.datasource.username=root: Here, you set the username for the MySQL database. In this case, it's "root."

spring.datasource.password=root: This line sets the password for the MySQL database. It's "root" in this example.

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect: It specifies the Hibernate dialect to be used, which is responsible for translating Java code into database-specific SQL statements. In this case, it's set for MySQL version 8.

spring.jpa.generate-ddl=true: This line tells Spring Boot to generate the Data Definition Language (DDL) SQL statements for creating or modifying database tables based on your entity classes.

spring.jpa.hibernate.ddl-auto=update: This line configures the Hibernate DDL auto-update behavior. It tells Spring Boot to automatically update the database schema if there are changes in your entity classes. "update" mode will apply changes to the database schema without dropping existing data.

server.servlet.context-path=/api: It sets the context path for your application. If you access your application, it will be available under http://localhost:9092/api. The "/api" part is the context path.

server.port=9092: This specifies the port on which your Spring Boot application will run. In this case, it's set to run on port 9092.

DEPENDENCIES USED 

spring-boot-starter-data-jpa:

Provides the necessary dependencies for using Spring Data JPA, which simplifies database access.
Allows you to work with databases using high-level repository interfaces, making database operations more straightforward.

spring-boot-starter-web:

Sets up a basic web application with Spring Boot.
Provides dependencies for building web-based applications, including an embedded web server (like Tomcat) and Spring MVC for handling web requests.

spring-boot-devtools:

Provides development-time features like automatic application restart on code changes and additional debugging tools.
Useful for speeding up the development process by reducing the need for manual application restarts.

mysql-connector-j:

A JDBC driver for connecting to MySQL databases.
Enables your Spring Boot application to interact with a MySQL database by providing the necessary database connectivity.

lombok:

A library that simplifies Java code by reducing boilerplate code.
Helps eliminate the need to write repetitive code like getters, setters, constructors, and more.

spring-boot-starter-test:

Provides dependencies for testing Spring Boot applications.
Includes testing libraries and tools for writing unit tests, integration tests, and more to ensure the reliability of your application.
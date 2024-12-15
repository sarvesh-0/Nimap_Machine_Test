Nimap Java Machine Test (Rest APIs for CRUD Operations || Category - Product one to many relationship)
Spring Boot Project: Nimap Java Machine Test

Description

This is a Spring Boot-based web application designed for the Nimap Java Machine Test. The application leverages Hibernate ORM for database operations and MySQL as the database. The project demonstrates the implementation of CRUD operations, REST APIs, and database interaction using JPA.

Features

CRUD operations for managing entities.

Integration with MySQL using Hibernate and JPA.

REST API endpoints for communication.

Configurable database connectivity.

Technologies Used

Backend: Spring Boot, Hibernate, JPA

Database: MySQL

Dependencies: Maven, Spring Data JPA, MySQL Connector

Build Tool: Maven

Prerequisites

Java 17 or later

MySQL 8.0 or later

Maven 3.8 or later

IDE (e.g., IntelliJ IDEA, Eclipse, Spring Tool Suite)

Installation and Setup

Clone the repository:

git clone https://github.com/your-repo/nimap-java-machine-test.git

Navigate to the project directory:

cd nimap-java-machine-test

Configure the database in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

Build the project using Maven:

mvn clean install

Run the application:

mvn spring-boot:run

Access the application:

API endpoints: http://localhost:8080/api

Database Setup

Log in to MySQL:

mysql -u root -p

Create the database:

CREATE DATABASE your_database_name;

Ensure the user root has access:

GRANT ALL PRIVILEGES ON your_database_name.* TO 'root'@'localhost';
FLUSH PRIVILEGES;



Common Issues and Troubleshooting

"Access denied for user 'root'@'localhost'"

Ensure the credentials in application.properties are correct.

Reset the MySQL root password if necessary:

ALTER USER 'root'@'localhost' IDENTIFIED BY 'your_password';
FLUSH PRIVILEGES;

"Unable to connect to MySQL"

Verify that the MySQL server is running on localhost and port 3306.

Test the connection with a MySQL client tool.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Contact

For any inquiries, please contact:

Name: Sarvesh Teware

Email: sarveshteware651@gmail.com

LinkedIn: Sarvesh Teware

GitHub: Sarvesh-0

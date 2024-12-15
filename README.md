# **Nimap Java Machine Test**

## **Overview**
This is a Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations on a MySQL database. The project is built using Hibernate for ORM, JPA for data persistence, and is configured to use a MySQL database.

---

## **Features**
- Implements CRUD operations.
- Follows RESTful API principles.
- Uses Spring Data JPA for database interaction.
- Configurable database connectivity using `application.properties`.

---

## **Technologies Used**
- **Backend**: Spring Boot 3.3.6, Hibernate, JPA  
- **Database**: MySQL  
- **Tools**: Maven, H2 Console, Postman (for API testing)

---

## **Requirements**
- **Java**: JDK 17 or higher  
- **Database**: MySQL 8.0 or higher  
- **Build Tool**: Maven 3.8 or higher  
- **IDE**: IntelliJ IDEA / Eclipse / Spring Tool Suite  

---

## **Setup Instructions**

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```
### 2. Configure the Database
Create a MySQL database:
```sql
Copy code
CREATE DATABASE your_database_name;
```
## Update the application.properties file:
```properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```
###3. Build the Application
Open the project in your IDE.
Run the following Maven command to build:
```bash
Copy code
mvn clean install
```
###4. Run the Application
-Start the Spring Boot application:
```bash
Copy code
mvn spring-boot:run
The application will run on http://localhost:8080.
```
###5. Test the Application
-Use Postman to test the API endpoints.

API Endpoints
Method	Endpoint	Description
GET	/api/your-endpoint	Retrieve all data
GET	/api/your-endpoint/{id}	Retrieve by ID
POST	/api/your-endpoint	Create new record
PUT	/api/your-endpoint/{id}	Update existing record
DELETE	/api/your-endpoint/{id}	Delete record
Contributing
Contributions are welcome! Please fork the repository and create a pull request for any feature additions or bug fixes.

License
This project is licensed under the MIT License.

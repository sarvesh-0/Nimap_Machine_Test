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
CREATE DATABASE machine_test;
```
## Update the application.properties file according to your setup:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/machine_test
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```
### 3. Build the Application
Open the project in your IDE.
Run the following Maven command to build:
```bash
mvn clean install
```
### 4. Run the Application
-Start the Spring Boot application:
```bash
mvn spring-boot:run
The application will run on http://localhost:8080.
```



## Database Initialization

Run the server and execute the following SQL queries to add initial records:

### Categories
```sql
INSERT INTO category VALUES
(1, "Electronic Devices"),
(2, "Sports"),
(3, "Clothing"),
(4, "Home Appliances"),
(5, "Footwear"),
(6, "Jewelry"),
(7, "Educational"),
(8, "Devotional"),
(9, "Toys"),
(10, "Accessories"),
(11, "Automobile");
SELECT * FROM category;
```

### Products
```sql
INSERT INTO product VALUES
(1, 800, "T-Shirt", 3),
(2, 1200, "Shirt", 3),
(3, 2100, "Pant", 3),
(4, 3500, "Kurta", 3),
(5, 1400, "Oversized T-Shirt", 3),
(6, 3000, "Jeans", 3),
(7, 45000, "Refrigerator", 4),
(8, 30000, "Washing Machine", 4),
(9, 60000, "Air Conditioner", 4),
(10, 20000, "Cooler", 4);
SELECT * FROM product;
```

---

## API Endpoints

### Category CRUD Operations

1. **GET All Categories**
   ```
   GET http://localhost:8080/api/categories?page=0
   ```

2. **Create a New Category**
   ```
   POST http://localhost:8080/api/categories
   Body (JSON):
   {
       "categoryName": "Utilities"
   }
   ```

3. **GET Category by ID**
   ```
   GET http://localhost:8080/api/categories/{id}
   ```

4. **Update Category by ID**
   ```
   PUT http://localhost:8080/api/categories/{id}
   Body (JSON):
   {
       "categoryName": "Most Sold"
   }
   ```

5. **Delete Category by ID**
   ```
   DELETE http://localhost:8080/api/categories/{id}
   ```

### Product CRUD Operations

1. **GET All Products**
   ```
   GET http://localhost:8080/api/products?page=1
   ```

2. **Create a New Product**
   ```
   POST http://localhost:8080/api/products
   Body (JSON):
   {
       "productName": "Jeans",
       "price": 3000,
       "category": {
           "categoryId": 3
       }
   }
   ```

3. **GET Product by ID**
   ```
   GET http://localhost:8080/api/products/{id}
   ```

4. **Update Product by ID**
   ```
   PUT http://localhost:8080/api/products/{id}
   Body (JSON):
   {
       "productName": "Fan",
       "price": 2000.0,
       "category": {
           "categoryId": 1,
           "categoryName": "Electronic Devices"
       }
   }
   ```

5. **Delete Product by ID**
   ```
   DELETE http://localhost:8080/api/products/{id}
   ```

---

## Testing Instructions

### Using Postman or REST Client

1. Import the API endpoints and test each operation.
2. Use the following sample payloads:

### Pagination

- Add `?page={page_number}` to GET endpoints for paginated responses.

---

## Notes

- Ensure the database is running before starting the application.
- Use proper IDs for GET, PUT, and DELETE operations.
- Error handling is implemented for invalid requests and database constraints.

## License

This project is licensed under the MIT License.

---

## Author

**Sarvesh Teware**  
Email: [sarveshteware651@gmail.com](mailto:sarveshteware651@gmail.com)  
GitHub: [sarvesh-0](https://github.com/sarvesh-0)  
LinkedIn: [Sarvesh Teware](https://linkedin.com/in/sarvesh-teware)


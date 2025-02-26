# High-Performance Inventory Management System 🚀

A high-performance inventory management system built using **Spring Boot**, **MySQL**, **Flyway**, **Docker**, and **Gradle**. This system provides a scalable and efficient way to manage products, users, and stock levels.

---

## **📂 Project Structure**

```
📦 high-performance-inventory-management-system
├── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java/com/example/High_Performance/Inventory/Management/System
│   │   │   ├── 📁 controller
│   │   │   ├── 📁 model
│   │   │   ├── 📁 repository
│   │   │   ├── 📁 service
│   │   │   ├── HighPerformanceInventoryManagementSystemApplication.java
│   │   ├── 📁 resources
│   │   │   ├── 📁 db/migration (Flyway SQL scripts)
│   │   │   ├── 📄 application.properties
│   ├── 📁 test
│
├── 📄 Dockerfile
├── 📄 docker-compose.yml
├── 📄 build.gradle
├── 📄 README.md
```

---

## **🛠️ Technologies Used**

- **Spring Boot** (Java 17)
- **Spring Data JPA** (Hibernate)
- **MySQL** (Database)
- **Flyway** (Database migrations)
- **Lombok** (Boilerplate reduction)
- **Docker & Docker Compose**
- **Gradle** (Build automation)
- **Gatling** (Performance testing)

---

## **🚀 Features**

✔️ **Product Management** (CRUD operations on products)\
✔️ **User Management** (Register, authenticate, and manage users)\
✔️ **Stock Tracking** (Monitor product inventory levels)\
✔️ **Database Migrations** (Using Flyway)\
✔️ **Performance Optimization** (HikariCP, Indexing, Redis Caching)\
✔️ **RESTful API** (Spring Boot REST controllers)\
✔️ **Dockerized Deployment**

---

## **⚙️ Installation & Setup**

### **1️⃣ Clone the Repository**

```sh
git clone https://github.com/yourusername/high-performance-inventory-management-system.git
cd high-performance-inventory-management-system
```

### **2️⃣ Setup MySQL (Docker)**

Start MySQL using Docker Compose:

```sh
docker-compose up -d
```

This will start a MySQL container.

### **3️⃣ Build the Project**

```sh
./gradlew clean build
```

### **4️⃣ Run the Application**

#### **Using Gradle**

```sh
./gradlew bootRun
```

#### **Using Docker**

```sh
docker-compose up --build
```

---

## **📝 API Endpoints**

### **🔹 Product APIs**

| Method   | Endpoint             | Description            |
| -------- | -------------------- | ---------------------- |
| `GET`    | `/api/products`      | Get all products       |
| `GET`    | `/api/products/{id}` | Get product by ID      |
| `POST`   | `/api/products`      | Add a new product      |
| `PUT`    | `/api/products/{id}` | Update product details |
| `DELETE` | `/api/products/{id}` | Delete a product       |

### **🔹 User APIs**

| Method | Endpoint              | Description         |
| ------ | --------------------- | ------------------- |
| `POST` | `/api/users/register` | Register a new user |
| `POST` | `/api/users/login`    | Authenticate user   |
| `GET`  | `/api/users/{id}`     | Get user by ID      |

---

## **📜 Database Schema**

### **🔹 **``** Table**

```sql
CREATE TABLE products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE INDEX idx_product_category ON products(category);
```

### **🔹 **``** Table**

```sql
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
CREATE INDEX idx_user_email ON users(email);
```

---

## **🐳 Docker Setup**

**1️⃣ Build & Start Containers**

```sh
docker-compose up --build -d
```

**2️⃣ Check Running Containers**

```sh
docker ps
```

**3️⃣ Stop & Remove Containers**

```sh
docker-compose down -v
```

---

## **📊 Performance Testing with Gatling**

Run performance tests using **Gatling**:

```sh
./gradlew gatlingRun
```

---

🚀 **High-Performance Inventory Management System - Scalable & Efficient!** 🚀


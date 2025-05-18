#  QuizAppMonotholic

A **Spring Boot-based Monolithic Quiz Application** that allows users to manage quizzes and related questions. This project demonstrates CRUD operations with proper layered architecture including DAO, Service, and Controller layers.

---

## 🏗️ Project Structure
QuizAppMonotholic/  
├── src/  
│ └── main/  
│ └── java/com/jiwanshu/quizapp/quizapp/  
│ ├── controller/ # REST API Controllers  
│ ├── service/ # Business logic  
│ ├── DAO/ # Repository layer  
│ ├── model/ # Entity classes  
│ └── QuizAppApplication.java  
│ └── resources/  
│ └── application.properties  
├── test/ # Unit tests  
├── mvnw, mvnw.cmd, pom.xml # Maven Wrapper & Build Config  

---

## ⚙️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- H2 / MySQL Database
- RESTful APIs
- Lombok
- Postman / Swagger for testing

---

## 🔍 Features

- 📌 Create, Read, Update, Delete (CRUD) operations for:
    - Quizzes
    - Questions
- 🔄 Link quizzes with questions
- ✅ Clean separation of concerns using layered architecture
- 🔍 Easy-to-use REST APIs
- 🧪 Unit tests included for core logic

---

## ▶️ Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/<your-username>/QuizAppMonotholic.git
cd QuizAppMonotholic
```
### 2. Build and Run
```bash
   ./mvnw spring-boot:run
```
### 3. Access the App
Swagger (if enabled): http://localhost:8080/swagger-ui/

APIs start at: http://localhost:8080

## Sample API Endpoints
Questions  
`GET /questions` - Get all questions

`GET /questions/{id}` - Get a specific question

`POST /questions` - Add a new question

`DELETE /questions/{id}` - Delete a question

Quizzes  
`GET /quizzes` - Get all quizzes

`GET /quizzes/{id}` - Get quiz with questions

`POST /quizzes` - Create a quiz

`DELETE /quizzes/{id}` - Delete a quiz





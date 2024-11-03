# Todo App

## Overview
A todo application REST API developed using Spring Boot.

Used **Spring Data JPA** for CRUD operations on a **MySQL** database, and **Spring Security** to implement **JWT** based authentication and authorization.  

Users can create new accounts using their email and password and Authenticated users can login with their email and password. 
Users can perform CRUD (Create, Read, Update, Delete) operations on their todos through this RESTful API.

## Technologies Used

- **Java**(Version 17)
- **Spring Boot**(Version 3.3.5)
- **Mysql Database**
- **JPA 
- **RESTful API**

## Getting Started

1. **Clone the Repository**: `git clone https://github.com/dilusha07/TO_DO_APP.git`
2. **Navigate to the Project Directory**: `cd TODOAPP`
3. **Build and Run the Application**: `./mvn spring-boot:run`
4. The application will start running at `http://localhost:8081`.
5. Use MYSQL database for a testing
  
## API Endpoints

- **POST /auth/{username}/todos**: Create a new todo.
- **POST /users/{username}/todos**: Create a new todo.
- **GET /users/todos**: Retrieve all todos for a specific user.
- **GET /users/{username}/todos/{id}**: Retrieve a single todo by its ID.
- **DELETE /users/{username}/todos/{id}**: Delete a todo by its ID.
- **PUT /users/{username}/todos/{id}**: Update a todo.
- **POST /users/{username}/todos**: Create a new todo.


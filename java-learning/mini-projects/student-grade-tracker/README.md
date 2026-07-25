# src.main.java.Student Grade Tracker

A Java CLI application for managing student records using **Object-Oriented Programming**, **HashMap**, and **PostgreSQL (JDBC)**. The project demonstrates CRUD operations, input validation, and academic performance analysis through a clean layered architecture.

---

## Features

* CRUD operations with PostgreSQL
* Fast student lookup using `HashMap`
* OOP with Inheritance, Polymorphism, Abstraction & Interfaces
* JDBC with Prepared Statements
* Centralized database management 
* Input validation and exception handling
* Grade and percentage calculation
* Class average generation

---

## Tech Stack

* Java (JDK 17+)
* PostgreSQL
* JDBC
* HashMap
* OOP

---

## Project Structure

```text
src.main.java.Main.java
src.main.java.StudentManager.java
src.main.java.TeacherManager.java
src.main.java.DBUtil.java
src.main.java.GradeSystem.java
src.main.java.Student.java
src.main.java.Teacher.java
src.main.java.User.java
src.main.java.Authenticatable.java
```

---

## Architecture

```text
src.main.java.Authenticatable
        │
        ▼
   src.main.java.User (Abstract)
     /        \
src.main.java.Student       src.main.java.Teacher
      │          |
src.main.java.StudentManager  src.main.java.TeacherManager
      │               |
      \               /
       \             /
        \           /
            src.main.java.DBUtil
           /     \
 PostgreSQL       PostgreSQL
```

---
 
## Learning Outcomes

* Object-Oriented Programming
* JDBC & PostgreSQL Integration
* CRUD Operations
* HashMap Optimization
* Input Validation
* Layered Architecture

---

## Author

Built as a Java backend learning project to demonstrate clean OOP design, JDBC database integration, and scalable student management principles.

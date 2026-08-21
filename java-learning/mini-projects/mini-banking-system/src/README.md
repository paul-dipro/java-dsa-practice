# Mini Banking System

A console-based banking system built with **Java** to practice object-oriented programming, collections, service-layer design, validation, and basic transaction handling.

This project is being developed incrementally as part of my journey toward **Java Backend Development**.

## Features

### Customer Management

* Add customers
* Prevent duplicate customer IDs
* Find customers
* Update customers
* Delete customers
* Retrieve all customers

### Account Management

* Create accounts
* Prevent duplicate account numbers
* Associate accounts with their owners
* Find accounts
* Retrieve all accounts
* Close accounts by changing their active status

### Account Operations

* Deposit money
* Withdraw money
* Prevent invalid deposits
* Prevent invalid withdrawals
* Prevent operations on inactive accounts
* Prevent withdrawals exceeding the available balance

### Transactions

* Transfer money between accounts
* Validate sender and receiver accounts
* Prevent self-transfers
* Validate transfer amounts
* Require both accounts to be active
* Prevent transfers with insufficient balance
* Roll back the withdrawal if the receiver deposit fails

## Project Structure

```text
src/
└── main/
    └── java/
        └── com/
            └── dipro/
                └── banking/
                    ├── Main.java
                    │
                    ├── model/
                    │   ├── Account.java
                    │   ├── AccountType.java
                    │   ├── Customer.java
                    │   └── Transaction.java
                    │
                    └── service/
                        ├── AccountService.java
                        ├── CustomerService.java
                        └── TransactionService.java
```

## Architecture

The current project follows a simple service-layer architecture:

```text
Main
 │
 ├── CustomerService
 │       └── Customer data
 │
 ├── AccountService
 │       └── Account data
 │
 └── TransactionService
         └── AccountService
```

`TransactionService` delegates account operations to `AccountService` rather than directly modifying the account collection.

## Technologies

* **Java**
* Java Collections (`HashMap`, `Map`, `Collection`)
* Object-Oriented Programming
* Java `LocalDateTime`
* IntelliJ IDEA
* Git & GitHub

## Current Testing

The project currently uses a `Main` class as an integration test runner.

Tested scenarios include:

* Successful customer creation
* Duplicate customer rejection
* Successful account creation
* Duplicate account rejection
* Account lookup
* Valid deposits
* Invalid deposits
* Valid withdrawals
* Insufficient-balance withdrawals
* Successful transfers
* Insufficient-balance transfers
* Invalid transfer amounts
* Self-transfers
* Nonexistent accounts
* Closed-account transfers
* Transfer rollback when the receiver cannot accept the deposit

Example successful transfer:

```text
Transfer ₹2000: true
Account 1: ₹8000.0
Account 2: ₹7000.0
```

Example failed transfer:

```text
Transfer To Closed Account: false
Sender Balance Before: ₹8000.0
Sender Balance After: ₹8000.0
```

## Current Limitations

This is an educational project and is **not production banking software**.

Current limitations include:

* In-memory data storage using `HashMap`
* No database persistence
* No REST API
* No authentication or authorization
* No concurrency handling
* No formal JUnit test suite yet
* `double` is currently used for monetary values
* Basic rollback logic rather than database transactions
* No transaction history persistence

## Roadmap

The project will be expanded progressively toward a backend application:

```text
Core Java
    ↓
Service Layer
    ↓
Testing
    ↓
Exception Handling
    ↓
Transaction History
    ↓
PostgreSQL
    ↓
   JDBC
    ↓
Spring Boot
    ↓
REST API
    ↓
Authentication & Authorization
    ↓
Cloud Deployment
```

## Purpose

The goal of this project is not to build a real banking platform. It is to build a progressively more realistic backend system while strengthening:

* Java fundamentals
* OOP
* Collections
* Encapsulation
* Service-layer design
* Validation
* State management
* Transaction thinking
* Testing
* Database integration
* Backend architecture

## Status

The project is actively being developed.

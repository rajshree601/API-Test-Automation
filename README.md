# API Automation Framework – Petstore

---

## Project Overview

This project is a **Hybrid API Automation Framework** built using industry-standard tools to automate and validate REST APIs of the Petstore application.

It demonstrates real-world automation practices including:

* BDD (Behavior Driven Development)
* API chaining
* Data validation
* Error handling
* Reporting

---

## Tech Stack

* **Java**
* **REST Assured**
* **Cucumber (BDD)**
* **Maven**
* **TestNG**
* **Log4j**
* **Postman**
* **Git**

---

## Project Structure

```bash
src
└── test
    ├── java
    │   ├── base
    │   │   └── BaseTest.java
    │   ├── hooks
    │   │   └── Hooks.java
    │   ├── runners
    │   │   └── TestRunner.java
    │   ├── stepDefinitions
    │   │   ├── PetSteps.java
    │   │   ├── StoreSteps.java
    │   │   ├── UserSteps.java
    │   │   └── CrossSteps.java
    │   ├── utils
    │   │   ├── RequestBuilder.java
    │   │   └── ResponseUtils.java
    │   └── pojo
    │       ├── Pet.java
    │       └── User.java
    │
    └── resources
        ├── features
        │   ├── pet.feature
        │   ├── store.feature
        │   ├── user.feature
        │   └── cross.feature
        ├── config
        │   └── config.properties
        └── log4j.properties
```

---

## Test Scenarios Covered

### 1. Pet Lifecycle (CRUD)

* Create pet (POST)
* Get pet (GET)
* Update pet (PUT)
* Delete pet (DELETE)

---

### 2. Inventory Analysis

* Fetch inventory
* Count available pets
* Validate using API response

---

### 3. User Negative Testing

* Create user with invalid email
* Fetch non-existing user
* Validate login failure

---

### 4. Cross Endpoint Validation

* Create pet
* Update status to sold
* Validate pet exists in sold list

---

## How to Run the Project

### Using Maven

```bash
mvn clean test
```

---

## Reports

After execution, open:

```bash
target/cucumber-report.html
```

 Displays execution results with scenario details

---

## Postman Collection

This project also includes a Postman collection with:

* GET request with query params
* POST request with request body
* Status code validations
* Environment variable usage

---

## Key Features

* Behaviour Driven Development (BDD) implementation using Cucumber
* Reusable and scalable framework
* Dynamic data generation
* API chaining using extracted IDs
* Maven-based execution
* Reporting support

---

## Notes

* The Petstore API may return inconsistent responses (e.g., login API always returns 200).
* Test cases are designed to handle such real-world API limitations.

---

## Future Enhancements

* Extent Reports integration
* CI/CD pipeline (Jenkins)
* Data-driven testing (Excel/JSON)
* Docker execution

---

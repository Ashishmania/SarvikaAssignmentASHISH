# SarvikaTechAssignment

## Overview
The **SarvikaTechAssignment** project is a backend application designed for Sarvika Technologies' assessment. It implements a `Product` entity in a Spring Boot application with Jakarta persistence, focusing on basic CRUD (Create, Read, Update, Delete) operations and proper exception handling. This project showcases interaction with a MySQL database and exposes RESTful API endpoints for managing product data.

## Features
- **Product Entity**: Defines product attributes such as `ID`, `name`, `description`, `price`, and `availability`.
- **CRUD Operations**: Supports full CRUD functionality for products.
- **RESTful API Endpoints**: Provides endpoints for product management.
- **Exception Handling**: Global exception handler for graceful error management, including handling of invalid or missing product IDs.
  
## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Installation

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- MySQL Database

### Setup Steps
1. **Clone the repository**:
    ```bash
    git clone https://github.com/Ashishmania/SarvikaAssignment.git
    ```
   
2. **Navigate to the project directory**:
    ```bash
    cd SarvikaTechAssignment
    ```
   
3. **Install dependencies and build the project**:
    ```bash
    mvn install
    ```

4. **Configure database**:
   - Set up your MySQL database connection in `src/main/resources/application.properties`:
     - Configure the `spring.datasource` settings (URL, username, password).
   
5. **Run the project**:
    ```bash
    mvn spring-boot:run
    ```

## Usage

### API Endpoints

#### 1. **Create Product**
- **POST**: `/products`
- **Payload Example**:
    ```json
    {
        "name": "Sample Product",
        "description": "A sample product description",
        "price": 19.99,
        "available": true
    }
    ```

#### 2. **Retrieve Product by ID**
- **GET**: `/products/{id}`
- Retrieve a product using its unique ID.

#### 3. **Update Product**
- **PUT**: `/products/{id}`
- **Payload Example**:
    ```json
    {
        "name": "Updated Product",
        "description": "Updated description",
        "price": 29.99,
        "available": false
    }
    ```

#### 4. **Delete Product**
- **DELETE**: `/products/{id}`
- Delete a product by its ID.

### Error Handling
- If a product is not found, a meaningful error message is returned with a `404 Not Found` status instead of a generic server error.

## Contributing

1. **Fork** the repository.
2. **Create a new branch**:
    ```bash
    git checkout -b feature/NewFeature
    ```
3. **Commit your changes**:
    ```bash
    git commit -m 'Add NewFeature'
    ```
4. **Push to the branch**:
    ```bash
    git push origin feature/NewFeature
    ```
5. **Open a Pull Request** for review.

## License
This project is licensed under the **MIT License** - see the LICENSE file for details.
```css
This README provides a structured overview of SarvikaTechAssignment project, explaining its purpose, setup steps, and how to use each CRUD endpoint.

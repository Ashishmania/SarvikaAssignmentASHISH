# SarvikaTechAssignment

## Overview
The SarvikaTechAssignment project is designed as part of an assessment for Sarvika Technologies. It includes a basic implementation of a `Product` entity in a Java-based backend application using Jakarta and Spring Boot. This project demonstrates the creation, retrieval, updating, and deletion (CRUD) operations on the `Product` entity.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Product Entity:** A class that defines product-related attributes such as ID, name, description, price, and availability status.
- **CRUD Operations:** Full support for creating, reading, updating, and deleting product data.
- **RESTful API Endpoints:** RESTful endpoints to interact with the product data.
- **Exception Handling:** Graceful handling of errors and edge cases, including a global exception handler for managing invalid or missing product IDs.

## Installation
### Prerequisites
- Java 17 or higher
- Maven 3.6+
- MYSQL database

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Ashishmania/SarvikaAssignment.git

2. Navigate to the project directory:
    ```bash
   cd SarvikaTechAssignment


3. Install dependencies and build the project:
     ```bash
     mvn install
4. Set up the database configuration in application.properties to connect to your MYSQL database.
5. Run the project:
    ```bash
    mvn spring-boot:run


## Usage
The following endpoints are available for interacting with the Product entity:

 **Create Product:**

POST : localhost:8080/products
Payload example
{
  "name": "Sample Product",
  "description": "A sample product description",
  "price": 19.99,
  "available": true
}
 **Retrieve Product:**

 GET :localhost:8080/products/{id} - Retrieve a product by ID.

 **Update Product:**

 PUT : localhost:8080/products/{id} - Update a product by ID.
Payload example:

{
  "name": "Updated Product",
  "description": "Updated description",
  "price": 29.99,
  "available": false
}

 **Delete Product:**


DELETE : localhost:8080/products/{id} - Delete a product by ID.

 **Error Handling:**

If a product is not found, a meaningful error response is returned instead of a generic server error.

 ## Contributing

Fork the repository
Create a feature branch (git checkout -b feature/NewFeature)
Commit your changes (git commit -m 'Add NewFeature')
Push to the branch (git push origin feature/NewFeature)
Open a Pull Request

 ## Licence

This project is licensed under the MIT License - see the LICENSE file for details.

 ```css
This README provides a structured overview of SarvikaTechAssignment project, explaining its purpose, setup steps, and how to use each CRUD endpoint.
 


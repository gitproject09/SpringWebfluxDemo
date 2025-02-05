# Spring boot WebFlux Demo

## Overview

Spring WebFlux Demo is a reactive, non-blocking application built with **Spring Boot** and **Spring WebFlux**. It showcases how to build reactive REST APIs using **Project Reactor (Mono & Flux)**.

## Technologies Used

- **Spring Boot**
- **Spring WebFlux**
- **Project Reactor**
- **Gradle (Kotlin DSL)**
- **Java**

## Project Structure

```
SpringWG── src/
│   ├── main/
│   │   ├── java/org.supan.webflux/
│   │   │   ├── controller/ (API Layer)
│   │   │   │   ├── CustomerController.java
│   │   │   ├── dao/ (Data Access Layer)
│   │   │   │   ├── CustomerDao.java
│   │   │   ├── dto/ (Data Transfer Objects)
│   │   │   │   ├── Customer.java
│   │   │   ├── service/ (Business Logic Layer)
│   │   │   │   ├── CustomerService.java
│   │   │   │   ├── MonoFluxTest.java (Reactive Stream Testing)
│   │   │   ├── SpringWebfluxDemoApplication.java (Main Entry Point)
│   │   ├── resources/
│   │   │   ├── application.properties
│   ├── test/ (Unit Tests)
│── build.gradle.kts (Gradle Build File)
│── settings.gradle.kts
│── README.md
```

## API Endpoints

| HTTP Method | Endpoint          | Description             |
| ----------- | ----------------- | ----------------------- |
| `GET`       | `/customers`      | Fetch all customers     |
| `GET`       | `/customers/{id}` | Fetch customer by ID    |
| `POST`      | `/customers`      | Create a new customer   |
| `PUT`       | `/customers/{id}` | Update customer details |
| `DELETE`    | `/customers/{id}` | Delete a customer       |

## Running the Project

1. Clone the repository:
   ```sh
   git clone <repo-url>
   cd SpringWebfluxDemo
   ```
2. Build the project:
   ```sh
   ./gradlew build
   ```
3. Run the application:
   ```sh
   ./gradlew bootRun
   ```
4. Open **[http://localhost:8080/customers](http://localhost:8080/customers)** in Postman or browser.

## Testing Reactive Streams

- **MonoFluxTest.java** contains test cases to validate the behavior of **Mono** and **Flux** streams.

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests.

## License

This project is licensed under the **MIT License**.

---

### Author: [Supan Ahmmed]

📧 Contact: [[spn.ahmed92@gmail.com](mailto:your.email@example.com)]
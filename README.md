# Experience API

A Java/Spring Boot REST API for managing local experiences. This project demonstrates a clean CRUD API using Spring Boot, Spring Data JPA, H2, Bean Validation, lifecycle callbacks, and OpenAPI/Swagger documentation.

## Live Demo

API: https://spring-experience-api-production.up.railway.app/  
Swagger: https://spring-experience-api-production.up.railway.app//swagger-ui/index.html

## Features

- Create, read, update, and delete experiences
- Request validation with Bean Validation
- Persistence with Spring Data JPA
- Automatic `createdAt` timestamp using JPA lifecycle callbacks
- Interactive OpenAPI/Swagger documentation
- H2 in-memory database for local development
- Layered architecture: Controller → Service → Repository → Entity

## Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- OpenAPI / Swagger UI

## Getting Started

### Prerequisites

Install Java 17 or newer.

You do not need to install Maven separately if using the included Maven wrapper.

### Run Locally

From the project root:

```bash
./mvnw spring-boot:run
```

The API will run at:

```text
http://localhost:8080
```

### Swagger Documentation

View and test the API using Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

### H2 Console

If enabled, the H2 database console is available at:

```text
http://localhost:8080/h2-console
```

Check `src/main/resources/application.properties` for the JDBC URL, username, and password.

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/experiences` | Get all experiences |
| GET | `/api/experiences/{id}` | Get one experience |
| POST | `/api/experiences` | Create an experience |
| PUT | `/api/experiences/{id}` | Update an experience |
| DELETE | `/api/experiences/{id}` | Delete an experience |

## Example Request

```json
{
  "title": "Rooftop Dinner",
  "description": "A relaxed dinner experience with skyline views."
}
```

## Example Response

```json
{
  "id": 1,
  "title": "Rooftop Dinner",
  "description": "A relaxed dinner experience with skyline views.",
  "createdAt": "2026-06-04T21:30:00",
  "price": "$20",
  "locationText": "Atlanta, GA"
}
```

## Project Structure

```text
src/main/java/.../
  controller/
  service/
  repository/
  entity/
  dto/
  exception/
  config/
```

## Future Improvements

- PostgreSQL production database
- Docker support
- Integration tests
- Authentication and authorization
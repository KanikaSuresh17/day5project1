# Bug Tracking System

A simple Java Maven project using PostgreSQL and JDBC to manage bug records.

## Features

- Insert bug details into PostgreSQL database
- Fetch and display all bugs
- JDBC database connectivity
- Maven project structure

## Technologies Used

- Java
- Maven
- PostgreSQL
- JDBC

## Project Structure

src/main/java
├── com.day5project1
│ ├── App.java
│ ├── dao
│ │ └── BugDAO.java
│ ├── model
│ │ └── Bug.java
│ └── util
│ └── DBUtil.java

## Database Table

```sql
CREATE TABLE bug (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    description VARCHAR(200),
    status VARCHAR(50)
);
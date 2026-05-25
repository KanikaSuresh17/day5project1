# Bug Management Application

## Overview

This project is a basic Bug Management System developed using Java, Maven, JDBC, and PostgreSQL.  
It allows users to store and retrieve bug details from a PostgreSQL database.

## Functionalities

- Add new bug records
- View all existing bugs
- Connect Java application with PostgreSQL using JDBC
- Perform database operations using DAO pattern

## Technologies

- Java
- Maven
- PostgreSQL
- JDBC

## Modules

### Bug Model
Represents bug details such as:
- Bug ID
- Title
- Description
- Status

### BugDAO
Handles database operations:
- Insert bug data
- Fetch all bugs

### DBUtil
Provides database connection utility.

## Database Configuration

Database used: PostgreSQL

Table structure:

```sql
CREATE TABLE bug (
    id INT PRIMARY KEY,
    title VARCHAR(100),
    description VARCHAR(200),
    status VARCHAR(50)
);

Compile Project:
mvn clean compile

Run Application:
mvn exec:java "-Dexec.mainClass=com.day5project1.App"

Sample Output
bug inserted successfully
bug inserted successfully

1
login issue
unable to login with valid credentials
open
----------------------------

2
page load error
home page takes too long to load
open

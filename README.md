# Spring Boot CRUD App

This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. It provides a set of API endpoints to perform basic operations on user data.

## Prerequisites

Before you begin, make sure you have the following installed:

Java Development Kit (JDK)

Spring Boot

Postman (or any API testing tool)


## Getting Started


Clone this repository to your local machine.

Open the project in your preferred Java development environment (e.g., IntelliJ, Eclipse).

Build and run the Spring Boot application.

## API Endpoints

### Create User
URL: POST /addUser
Description: Create a new user with the provided user details.
Request Body: JSON with user information (e.g., name, time)

Example Request:

POST /addUser
Request Body:
{
    "name": "John Doe",
    "time": "12:45:00"
}

### Get Users

URL: GET /users

Description: Retrieve a list of all users in the system.
Example Request:
json

GET /users

### Update User

URL: PUT /updateUser

Description: Update an existing user's information.
Request Body: JSON with updated user information
Example Request:
json

PUT /updateUser
Request Body:
{
    "id": 1,
    "name": "Jane Doe",
    "time": "14:30:00"
}

### Patch User

URL: PATCH /patchUser

Description: Partially update an existing user's information.
Request Body: JSON with instructions on how to modify the user information
Example Request:

PATCH /patchUser
Request Body:
[
    { "op": "replace", "path": "/name", "value": "Jane Doe" },
    { "op": "add", "path": "/time", "value": "15:30:00" }
]

### Delete User

URL: DELETE /deleteUser

Description: Delete a user by their ID.
Request Parameter: id (user ID to delete)
Example Request:
bash
Copy code
DELETE /deleteUser?id=1

Using Postman

You can use Postman to test the API endpoints:

Launch Postman.
Select the HTTP method (GET, POST, PUT, PATCH, DELETE).
Enter the appropriate URL as mentioned in the API endpoints section.
Provide request body or parameters as needed.
Click the "Send" button to make the API request.

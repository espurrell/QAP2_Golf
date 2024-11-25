Golf Club Tournament Project

Overview

This project is a simple application for managing golf club tournaments and memberships. 
It includes REST API endpoints to add, retrieve, and search for members and tournaments. 
The project also supports adding members to tournaments. The database used is MySQL, and Docker support is provided for easy deployment.

Features

- Add and retrieve members and tournaments
- Search for members by name, membership type, phone number, or membership start date
- Search for tournaments by start date, location, or participating members
- Add members to tournaments
- Dockerized for easy deployment

oints
Members
POST /members
Description: Add a new member.
Request Body:
json
Copy code
{
  "name": "John Doe",
  "address": "123 Golf St.",
  "email": "john.doe@example.com",
  "phoneNumber": "555-1234",
  "startDate": "2024-01-01",
  "membershipDuration": 12
}
GET /members
Description: Retrieve all members.
Response Body:
json
Copy code
[
  {
    "id": 1,
    "name": "John Doe",
    "address": "123 Golf St.",
    "email": "john.doe@example.com",
    "phoneNumber": "555-1234",
    "startDate": "2024-01-01",
    "membershipDuration": 12
  }
]
GET /members/search
Description: Search for members by various criteria.
Query Parameters:
name: Search members by name (partial match).
phoneNumber: Search members by phone number.
startDate: Search members who joined after a given date.
Example:
sql
Copy code
GET /members/search?name=John
Tournaments
POST /tournaments
Description: Add a new tournament.
Request Body:
json
Copy code
{
  "startDate": "2024-06-01",
  "endDate": "2024-06-03",
  "location": "Golf Club A",
  "entryFee": 50.00,
  "cashPrize": 5000.00
}
GET /tournaments
Description: Retrieve all tournaments.
Response Body:
json
Copy code
[
  {
    "id": 1,
    "startDate": "2024-06-01",
    "endDate": "2024-06-03",
    "location": "Golf Club A",
    "entryFee": 50.00,
    "cashPrize": 5000.00
  }
]
GET /tournaments/search
Description: Search for tournaments by various criteria.
Query Parameters:
start: Search for tournaments starting on or after a given date.
location: Search tournaments by location.
Example:
sql
Copy code
GET /tournaments/search?location=Golf Club A
Add Member to Tournament
POST /tournaments/{tournamentId}/members
Description: Add a member to a tournament.
Request Body:
json
Copy code
{
  "memberId": 1
}
Response Body:
json
Copy code
{
  "id": 1,
  "startDate": "2024-06-01",
  "endDate": "2024-06-03",
  "location": "Golf Club A",
  "entryFee": 50.00,
  "cashPrize": 5000.00,
  "participants": [
    {
      "id": 1,
      "name": "John Doe"
    }
  ]
}
Docker Setup
Prerequisites
Docker and Docker Compose must be installed on your machine. You can download and install Docker from the official site.
Running the Application in Docker
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/golf-club-tournament.git
cd golf-club-tournament
Build and start the Docker containers:

Navigate to the root directory of the project where Dockerfile and docker-compose.yml are located.
Run the following command to build and start the containers:
bash
Copy code
docker-compose up --build
Access the application:

The backend will be available at http://localhost:8080.
MySQL will be running at localhost:3306 with the credentials:
Username: root
Password: your_password
Testing the API:

You can use Postman or any other API client to test the API endpoints. Refer to the API section above for available endpoints.
Stopping the Docker containers:

To stop the containers, run:
bash
Copy code
docker-compose down
Project Structure
css
Copy code
golf-club-tournament-project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── yourpackage/
│   │   │           ├── Member.java
│   │   │           ├── Tournament.java
│   │   │           ├── MemberController.java
│   │   │           └── TournamentController.java
│   │   ├── resources/
│   │   │   └── application.properties
│   └── test/
├── target/
│   └── your-jar-file.jar
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── README.md
License
This project is licensed under the MIT License - see the LICENSE file for details.

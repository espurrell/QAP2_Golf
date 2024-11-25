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


Docker Setup
Prerequisites
Docker and Docker Compose must be installed on your machine. You can download and install Docker from the official site.
Running the Application in Docker

Clone the repository:
bash
git clone https://github.com/yourusername/golf-club-tournament.git
cd golf-club-tournament
Build and start the Docker containers:

Navigate to the root directory of the project where Dockerfile and docker-compose.yml are located.

Run the following command to build and start the containers:
bash
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
docker-compose down

License
This project is licensed under the MIT License - see the LICENSE file for details.

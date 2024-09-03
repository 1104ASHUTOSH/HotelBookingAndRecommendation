# HotelBookingAndRecommendation

This project is a full-stack web application designed to facilitate hotel bookings and provide personalized hotel recommendations based on user activities. It is built with a Java Spring Boot backend and a React frontend.

Table of Contents:-------------

Project Overview:

Features:

Backend (Java Spring Boot):

--Project Setup:

--API Endpoints:

Frontend (React)::

--Project Setup:

--Components:

Database:

Running the Application:

Future Enhancements


Project Overview:---

The Hotel Booking & Recommendation Platform allows users to:
Browse hotels.
Track hotel page visits.
Create draft bookings and finalize reservations.
View ongoing activities on hotel pages.
Receive hotel recommendations based on their activities.


Features:------

Hotel Management: Basic CRUD operations for managing hotels.
User Activities: Tracks user visits, draft bookings, and completed bookings.
Recommendation Engine: Suggests hotels based on user activity.
Responsive UI: Built with React to provide a seamless user experience.

Backend (Java Spring Boot)--------
Project Setup:--

Clone the Repository:
git clone https://github.com/yourusername/hotel-booking-platform.git  
cd hotel-booking-platform/backend                          //// eg. for me the yourusername="1104ASHUTOSH"

Build the Project:
mvn clean install

Run the Application:
mvn spring-boot:run

API Endpoints:-
Hotels:-

GET /api/hotels:           //Retrieve all hotels.
GET /api/hotels/{id}:       //Retrieve a specific hotel by ID.
POST /api/hotels:             //Add a new hotel.
DELETE /api/hotels/{id}:        //Delete a hotel by ID.

Activities:

GET /api/activities/hotel/{hotelId}: Get activities by hotel ID.
POST /api/activities: Log an activity (visit, draft booking, completed booking).

Recommendations:

GET /api/recommendations/{userId}: Get hotel recommendations for a user.





Frontend (React):-----
Project Setup:--

Navigate to the Frontend Directory:
cd frontend

Install Dependencies:
npm install

Run the Application:
npm start

Components:-
HotelList: Displays a list of all hotels.
HotelDetail: Shows detailed information about a specific hotel.
RecommendationList: Displays recommended hotels based on user activity.

Database:
The application uses an H2 in-memory database for development purposes.
Data is populated from data.sql on startup.
You can access the H2 console at /h2-console (default credentials: sa/password).

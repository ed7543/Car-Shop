# Car Shop
CarShop Management System
CarShop is a Spring Boot application for managing a car dealership system. It provides functionality for administrators, dealership owners, and customers, with features such as user authentication, car management, dealership handling, and role-based access control.

Features
Authentication & Authorization
JWT-based login & registration
Role hierarchy: ADMIN > OWNER > CUSTOMER
Role-based access to endpoints
User Management
Register & login users
Secure password hashing with PasswordEncoder
Fetch user profile (/api/user/me)
Car Management
Add, update, and delete cars (Admin & Owner only)
View cars and details (Customer access)
Upload & manage car images
Dealership Management
Owners can manage their own dealership and cars
Admins can manage all dealerships
Security
JWT filter integration
Stateless session management
CORS configuration for frontend integration

Tech Stack
Backend: Spring Boot 3, Spring Security, JWT, Lombok
Database: H2 (development), PostgreSQL/MySQL (production-ready)
Build Tool: Maven
Frontend (planned): React

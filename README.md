# 🚌 Bus Ticket Reservation System

## 🛠️ Tech Stack
- **Programming Language**: Java  
- **Database**: MySQL  
- **Database Connectivity**: JDBC  

---

## 📖 Problem Description
The **Bus Ticket Reservation System** is designed to cater to the needs of passengers traveling from one point to another. It includes essential modules like **Customer** and **Administrator**, allowing users to book, manage, and cancel bus tickets efficiently.

This is a **console-based application** with an intuitive interface for seamless user experience.

---

## 👥 Users of the Application
1. **Customer**  
2. **Administrator**

---

## 🎯 Roles and Functionalities

### 🚶‍♂️ Customer
- Book tickets by selecting source and destination.
- Cancel booked tickets.

### 👨‍💼 Administrator
- Login with a secure username and password.
- Manage buses by providing details such as:
  - Bus Name  
  - Bus Route  
  - Bus Type (AC/non-AC)  
  - Number of Seats  
  - Departure and Arrival Times
- Confirm seat bookings for customers.
- Share contact details with customers upon booking confirmation.

> **Note**: Once a seat is booked, it is automatically deducted from the available seats.

---

## 🔒 Login Details

### 🛡️ Administrator Login
- **Username**: `admin@mail.com`  
- **Password**: `admin`

### 🛡️ Customer Login
- Customers must register first if they are not already registered.  
- Login with the registered **username** and **password**.

---

## ✈️ Book Ticket Functionality
- Customers can book tickets by entering their **source** and **destination**.  
- Available buses will be displayed for the entered route, and users can select a seat to book.

---

## 💡 Features
- **Dynamic Seat Management**: Seats automatically update after each booking or cancellation.  
- **User Registration**: Allows customers to create accounts for personalized usage.  
- **Secure Admin Access**: Only authorized personnel can manage the system.  
- **Real-Time Updates**: View and manage bus schedules and seat availability.  

---

## 📂 Code Organization

- **`Admin.java`**: Handles admin login, bus management, and seat confirmation.  
- **`Customer.java`**: Manages customer registration, login, ticket booking, and cancellations.  
- **`DatabaseConnection.java`**: Establishes connection to MySQL using JDBC.  
- **`Bus.java`**: Defines bus attributes such as name, route, type, and timings.  
- **`Ticket.java`**: Manages ticket details and availability.  

---

## 🚀 Getting Started

### ✅ Prerequisites
- Install **Java** (JDK 8 or later).  
- Install **MySQL** and set up the required database.  
- JDBC driver (compatible with your database version).  

### 📥 Installation Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/BHUVANESH-SSN/BUS-TICKET-RESERVATION-SYSTEM-JAVA.git

2.cd Bus-Ticket-Reservation-System

3. javac *.java

4. java Main





   

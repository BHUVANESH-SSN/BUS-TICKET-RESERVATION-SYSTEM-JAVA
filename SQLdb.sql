-- Drop and recreate the database
DROP DATABASE IF EXISTS busticketreservationsystem;
CREATE DATABASE busticketreservationsystem;
USE busticketreservationsystem;

-- Create tables with corrected structure
CREATE TABLE admin (
    userid INT PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(15) NOT NULL
);

CREATE TABLE customer (
    cid INT PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(15) NOT NULL
);

CREATE TABLE contact_person (
    cpid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL UNIQUE,
    mobile VARCHAR(10) NOT NULL
);

CREATE TABLE bus_link (
    blid INT PRIMARY KEY AUTO_INCREMENT,
    source VARCHAR(15) NOT NULL,
    dest VARCHAR(15) NOT NULL,
    arrival TIME NOT NULL,
    dept TIME NOT NULL,
    seat INT NOT NULL
);

CREATE TABLE bus (
    bid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    type VARCHAR(6) NOT NULL,
    blid INT NOT NULL,
    cpid INT NOT NULL,
    FOREIGN KEY (blid) REFERENCES bus_link(blid) ON DELETE CASCADE,
    FOREIGN KEY (cpid) REFERENCES contact_person(cpid) ON DELETE CASCADE
);

CREATE TABLE booking (
    bkid INT PRIMARY KEY AUTO_INCREMENT,
    cid INT NOT NULL,
    bid INT NOT NULL,
    FOREIGN KEY (cid) REFERENCES customer(cid) ON DELETE CASCADE,
    FOREIGN KEY (bid) REFERENCES bus(bid) ON DELETE CASCADE
);

-- Insert sample data
-- Admin data
INSERT INTO admin (Email, password) VALUES ('adminmail', 'adminpass');

-- Customer data with Tamil names
INSERT INTO customer (Email, password) VALUES 
    ('rajanmail', 'customerpass1'),
    ('mohanmail', 'customerpass2'),
    ('vimalmail', 'customerpass3'),
    ('selvamail', 'customerpass4'),
    ('balarajmail', 'customerpass5'),
    ('easycustomer', 'customerpass6');

-- Contact Person data
INSERT INTO contact_person (name, mobile) VALUES 
    ('Arun Kumar', '1234567890'),
    ('Priya', '2345678901'),
    ('Ramesh', '3456789012'),
    ('Deepa', '4567890123'),
    ('Karthik', '5678901234');

-- Bus link data for routes within Tamil Nadu
INSERT INTO bus_link (source, dest, arrival, dept, seat) VALUES 
    ('Chennai', 'Madurai', '10:00:00', '06:00:00', 40),
    ('Coimbatore', 'Salem', '12:00:00', '08:00:00', 30),
    ('Trichy', 'Erode', '15:00:00', '11:00:00', 35),
    ('Madurai', 'Tirunelveli', '17:00:00', '13:00:00', 40),
    ('Chennai', 'Coimbatore', '20:00:00', '16:00:00', 50),
    ('Salem', 'Trichy', '09:00:00', '05:00:00', 40),
    ('Erode', 'Chennai', '19:00:00', '15:00:00', 30),
    ('Tirunelveli', 'Madurai', '14:00:00', '10:00:00', 35),
    ('Trichy', 'Chennai', '22:00:00', '18:00:00', 45),
    ('Coimbatore', 'Madurai', '06:00:00', '02:00:00', 35);

-- Bus data, linking buses to bus routes and contact persons
INSERT INTO bus (name, type, blid, cpid) VALUES 
    ('TN Express 1', 'AC', 1, 1),
    ('TN Express 2', 'Non-AC', 2, 2),
    ('TN Express 3', 'AC', 3, 3),
    ('TN Express 4', 'Non-AC', 4, 4),
    ('TN Express 5', 'AC', 5, 5),
    ('TN Express 6', 'Non-AC', 6, 1),
    ('TN Express 7', 'AC', 7, 2),
    ('TN Express 8', 'Non-AC', 8, 3),
    ('TN Express 9', 'AC', 9, 4),
    ('TN Express 10', 'Non-AC', 10, 5);

-- Sample booking data, assuming existing customer and bus IDs
INSERT INTO booking (cid, bid) VALUES 
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6);
    
    SELECT * FROM bus;
    SELECT * FROM bus_link;
    SELECT * FROM customer;

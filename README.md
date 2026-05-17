# hotel-management-system
Java OOP team project for managing rooms, guests and bookings in a hotel system.

## Team Nova
- Alfredo Romero Alonso
- Javier Varona Mateos
- Unė Sutkutė
- Palmyra Malinauskaitė

## Roles
- Architect: Javier Varona Mateos
- Builder: Alfredo Romero Alonso
- Critic: Unė Sutkutė
- Designer: Palmyra Malinauskaitė
- Exhibitor: Palmyra Malinauskaitė
- Facilitator: Unė Sutkutė

## Project description

Nova Hotel Management System is a Java console application created for the Object-Oriented Programming team project.  
The system allows basic hotel operations such as managing rooms, managing customers, creating bookings, cancelling bookings and checking room availability.

The project is designed using object-oriented principles. The main data classes are placed in the `model` package, while the operation logic is handled by manager classes in the `manager` package.

## Current Stage 2 functionality

The current version includes:

- Initial hotel data loading
- Room management
- Customer management
- Booking creation
- Booking cancellation
- Room availability checking
- Interactive console menu
- Basic input validation
- Booking status management (`ACTIVE` / `CANCELLED`)

## Project structure

```text
src/
├── Main.java
├── model/
│   ├── Hotel.java
│   ├── Room.java
│   ├── Customer.java
│   └── Booking.java
└── manager/
    ├── RoomManager.java
    ├── CustomerManager.java
    └── BookingManager.java

## Main classes

Model classes:

- Hotel: stores the main collections of rooms, customers and bookings.
- Room: represents a hotel room with number, type, price and availability.
- Customer: represents a hotel customer with ID, name and email.
- Booking: connects a customer with a room and stores booking information.

Manager classes:

- RoomManager: handles room-related operations.
- CustomerManager: handles customer-related operations.
- BookingManager: handles booking creation, searching and cancellation.

## How to compile

From the project root folder, run:
javac src/Main.java src/model/*.java src/manager/*.java
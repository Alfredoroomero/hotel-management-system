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

## How to run

After compiling, run:       java -cp src Main

## Console menu

When the program starts, the following menu is shown:

===== NOVA HOTEL MANAGEMENT SYSTEM =====
1. Show all rooms
2. Show available rooms
3. Show customers
4. Show bookings
5. Create booking
6. Cancel booking
0. Exit


## Example test flow

A simple test flow for the current version is:

1. Select option 2 to show available rooms.
2. Select option 5 to create a booking.
3. Use customer ID C001.
4. Use room number 102.
5. Enter the number of nights.
6. Select option 4 to show bookings.
7. Select option 2 again to check that the booked room is no longer available.
8. Select option 6 to cancel the booking.
9. Select option 2 again to check that the room is available again.


## Example initial data

The program currently loads sample data when it starts.

Rooms:

Room 101: Single, 50.0 per night
Room 102: Double, 80.0 per night
Room 201: Suite, 120.0 per night

Customers:

C001: Alice Brown
C002: John Smith

Technologies used:

-Java
-Java Standard Library
-VS Code
-Git
-GitHub

No third-party libraries are currently used in the code.

## Planned Stage 3 improvements

Possible future improvements include:

-Billing and invoice generation
-File storage
-More complete check-in and check-out logic
-More advanced validation
-Improved user interface
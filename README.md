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
The system allows basic hotel operations such as managing rooms, managing customers, creating bookings, cancelling bookings, checking room availability, and generating
simple invoices for bookings.

The project is designed using object-oriented principles. The main data classes are placed in the `model` package, while the operation logic is handled by manager classes in the `manager` package.

## Final Stage 3 functionality

The final version includes:

- Initial hotel data loading
- Interactive console menu
- Room management
- Customer management
- Adding new rooms from the menu
- Addind new customer from the menu
- Booking creation
- Booking cancellation
- Room availability checking
- Booking status management (`ACTIVE` / `CANCELLED`)
- Invoice / billing generation
- Input validation for numbers
- Validation for duplicated room numbers
- Validation for duplicated customer IDs
- Validation for duplicated booking IDs
- Validation for positive number of nights
- Validation for positive room prices
- Improved user messages


## Project structure

```text
src/
├── Main.java
├── model/
│   ├── Hotel.java
│   ├── Room.java
│   ├── Customer.java
│   ├── Booking.java
│   └── Invoice.java
└── manager/
    ├── RoomManager.java
    ├── CustomerManager.java
    ├── BookingManager.java
    └── BillingManager.java

## Main classes

Model classes:

- Hotel: stores the main collections of rooms, customers and bookings.
- Room: represents a hotel room with number, type, price and availability.
- Customer: represents a hotel customer with ID, name and email.
- Booking: connects a customer with a room and stores booking information.
- Invoice: represents a simple invoice generated from a booking.

Manager classes:

- RoomManager: handles room-related operations.
- CustomerManager: handles customer-related operations.
- BookingManager: handles booking creation, searching and cancellation.
- BillingManager: handles invoice and billing operations.

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
7. Add customer
8. Add room
9. Generate invoice
0. Exit


## Example test flow

A simple test flow for the current version is:

1. Select option `2` to show available rooms.
2. Select option `7` to add a new customer.
3. Select option `8` to add a new room.
4. Select option `5` to create a booking.
5. Use an existing customer ID, for example `C001`.
6. Use an available room number, for example `102`.
7. Enter a positive number of nights.
8. Select option `4` to show active bookings.
9. Select option `9` to generate an invoice for the booking.
10. Select option `6` to cancel the booking.
11. Select option `2` again to check that the room is available again.
12. Try to generate an invoice for the cancelled booking to check the validation.
13. Select option `0` to exit the application.


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

## Changes from Stage 2 to Stage 3

The main changes from Stage 2 to Stage 3 are:

1. Improved the interactive console menu with more final user options.
2. Added customer creation from the menu.
3. Added room creation from the menu.
4. Kept and improved booking cancellation.
5. Added invoice and billing generation for active bookings.
6. Added validation to prevent invoices from being generated for cancelled or non-existing bookings.
7. Improved input validation, including positive number of nights and positive room prices.
8. Improved validation for duplicated room numbers, customer IDs and booking IDs.
9. Improved user messages to make the application clearer.
10. Updated the project structure with the new `Invoice` model and `BillingManager` class.
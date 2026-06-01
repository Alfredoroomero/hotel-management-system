import java.util.Scanner;

import manager.BookingManager;
import manager.CustomerManager;
import manager.RoomManager;
import model.Booking;
import model.Customer;
import model.Hotel;
import model.Room;

// This class runs the console application for stage 2.
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Create the hotel
        Hotel hotel = new Hotel("Nova Hotel");

        // Create managers
        RoomManager roomManager = new RoomManager();
        CustomerManager customerManager = new CustomerManager();
        BookingManager bookingManager = new BookingManager();

        // Load initial test data
        loadInitialData(hotel, roomManager, customerManager);

        int option;

        do {
            showMenu();
            option = readInt(scanner, "Choose an option: ");

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("ALL ROOMS:");
                    roomManager.showRooms(hotel);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("AVAILABLE ROOMS:");
                    roomManager.showAvailableRooms(hotel);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("CUSTOMERS:");
                    customerManager.showCustomers(hotel);
                    break;

                case 4:
                    System.out.println();
                    System.out.println("BOOKINGS:");
                    bookingManager.showBookings(hotel);
                    break;

                case 5:
                    createBookingFromInput(scanner, hotel, customerManager, bookingManager);
                    break;

                case 6:
                    cancelBookingFromInput(scanner, hotel, bookingManager);
                    break;

                case 7:
                    addCustomerFromInput(scanner, hotel, customerManager);
                    break;

                case 0:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();

        } while (option != 0);

        scanner.close();
    }

    // Loads basic data to test the application.
    private static void loadInitialData(Hotel hotel, RoomManager roomManager, CustomerManager customerManager){

        roomManager.addRoom(hotel, new Room(101, "Single", 50.0));
        roomManager.addRoom(hotel, new Room(102, "Double", 80.0));
        roomManager.addRoom(hotel, new Room(201, "Suite", 120.0));

        customerManager.addCustomer(hotel, new Customer("C001", "Alice Brown", "alice@example.com"));
        customerManager.addCustomer(hotel, new Customer("C002", "John Smith", "john@example.com"));
    }

    // Prints the application menu.
    private static void showMenu(){

        System.out.println("===== NOVA HOTEL MANAGEMENT SYSTEM =====");
        System.out.println("1. Show all rooms");
        System.out.println("2. Show available rooms");
        System.out.println("3. Show customers");
        System.out.println("4. Show bookings");
        System.out.println("5. Create booking");
        System.out.println("6. Cancel booking");
        System.out.println("7. Add customer");
        System.out.println("0. Exit");
    }

    // Creates a booking using data entered by the user.
    private static void createBookingFromInput(Scanner scanner, Hotel hotel, CustomerManager customerManager, BookingManager bookingManager){

        scanner.nextLine();

        System.out.print("Enter booking ID: ");
        String bookingId = scanner.nextLine();

        if (bookingManager.findBookingById(hotel, bookingId) != null){
            System.out.println("Booking could not be created because the booking ID already exists.");
            return;
        }

        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        Customer customer = customerManager.findCustomerById(hotel, customerId);

        if (customer == null){
            System.out.println("Customer not found.");
            return;
        }

        int roomNumber = readInt(scanner, "Enter room number: ");
        int numberOfNights = readPositiveInt(scanner, "Enter number of nights: ");

        Booking booking = bookingManager.createBooking(hotel, bookingId, customer, roomNumber, numberOfNights);

        if (booking != null){
            System.out.println("Booking created successfully:");
            System.out.println(booking);
        } else {
            System.out.println("Booking could not be created. The room may not be available.");
        }
    }

    // Cancels a booking using its ID.
    private static void cancelBookingFromInput(Scanner scanner, Hotel hotel, BookingManager bookingManager){

        scanner.nextLine();

        System.out.print("Enter booking ID to cancel: ");
        String bookingId = scanner.nextLine();

        boolean cancelled = bookingManager.cancelBooking(hotel, bookingId);

        if (cancelled){
            System.out.println("Booking cancelled successfully.");
        } else {
            System.out.println("Booking could not be found.");
        }
    }

    // Adds a new customer using data entered by the user.
    private static void addCustomerFromInput(Scanner scanner, Hotel hotel, CustomerManager customerManager){

        scanner.nextLine();

        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        if (customerManager.findCustomerById(hotel, customerId) != null){
            System.out.println("Customer could not be added because the ID already exists.");
            return;
        }

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();

        Customer customer = new Customer(customerId, name, email);
        boolean added = customerManager.addCustomer(hotel, customer);

        if(added){

            System.out.println("Customer added successfully:");
            System.out.println(customer);

        }else{
            System.out.println("Customer could not be added");
        }
    }

    // Reads an integer from the user.
    private static int readInt(Scanner scanner, String message){

        System.out.print(message);

        while (!scanner.hasNextInt()){

            System.out.println("Invalid number. Please try again.");
            scanner.next();
            System.out.print(message);
        }

        return scanner.nextInt();
    }

    // Reads a positive integer from the user.
    private static int readPositiveInt(Scanner scanner, String message){

        int number = readInt(scanner, message);

        while (number <= 0){
            System.out.println("The number must be greater than 0.");
            number = readInt(scanner, message);
        }

        return number;
    }
}
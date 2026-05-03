import model.Booking;
import model.Customer;
import model.Hotel;
import model.Room;

// This class runs a small proof of concept for stage 1.
public class Main {

    public static void main(String[] args) {

        // Create the hotel
        Hotel hotel = new Hotel("Sunset Hotel");

        // Add some rooms
        hotel.addRoom(new Room(101, "Single", 50.0));
        hotel.addRoom(new Room(102, "Double", 80.0));
        hotel.addRoom(new Room(201, "Suite", 120.0));

        // Create a customer
        Customer customer = new Customer("C001", "Alice Brown", "alice@example.com");

        // Create a booking
        Booking booking = hotel.createBooking("B001", customer, 102, 3);

        System.out.println("HOTEL INFORMATION");
        System.out.println("Hotel name: " + hotel.getHotelName());
        System.out.println();

        System.out.println("ROOMS:");
        hotel.showRooms();
        System.out.println();

        if (booking != null) {

            System.out.println("BOOKING CREATED SUCCESSFULLY:");
            System.out.println(booking);
            
        } else {
            System.out.println("Booking could not be created.");
        }

        System.out.println();
        System.out.println("ALL BOOKINGS:");
        hotel.showBookings();
    }
}
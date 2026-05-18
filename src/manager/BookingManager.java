package manager;

import model.Booking;
import model.Customer;
import model.Hotel;
import model.Room;

//This class handles booking creation and related operations.
public class BookingManager {

    //Creates a booking if the selected room is available.
    public Booking createBooking(Hotel hotel, String bookingId, Customer customer, int roomNumber, int numberOfNights){
        
        if (findBookingById(hotel, bookingId) != null){
            return null;
        }

        Room room = hotel.findAvailableRoom(roomNumber);

        if (room == null) {
            return null;
        }

        Booking booking = new Booking(bookingId, customer, room, numberOfNights);
        hotel.getBookings().add(booking);
        room.setAvailable(false);

        return booking;
    }

    //Searches for a booking by its ID.
    public Booking findBookingById(Hotel hotel, String bookingId){

        for (Booking booking : hotel.getBookings()){

            if (booking.getBookingId().equals(bookingId)){
                return booking;
            }
        }

        return null;
    }

    //Cancels a booking if it exists.
    public boolean cancelBooking(Hotel hotel, String bookingId){

        Booking booking = findBookingById(hotel, bookingId);

        if (booking == null){
            return false;
        }

        if (booking.getStatus().equals("CANCELLED")){
            return false;
        }

        booking.cancelBooking();
        return true;
    }

    //Shows only active bookings in the hotel
    public void showBookings(Hotel hotel){

        boolean foundActiveBooking = false;

        for (Booking booking : hotel.getBookings()){

            if (!booking.getStatus().equals("CANCELLED")){

                System.out.println(booking);
                foundActiveBooking = true;
            }
        }

        if (!foundActiveBooking){
            System.out.println("No active bookings found.");
        }
    }

    //Shows all bookings, including cancelled ones
    public void showAllBookings(Hotel hotel){

        hotel.showBookings();
    }
}
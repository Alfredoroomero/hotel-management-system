package manager;

import model.Booking;
import model.Customer;
import model.Hotel;
import model.Room;

//This class handles booking creation and related operations.
public class BookingManager {

    //Creates a booking if the selected room is available.
    public Booking createBooking(Hotel hotel, String bookingId, Customer customer, int roomNumber, int numberOfNights){
        
        Room room = hotel.findAvailableRoom(roomNumber);

        if (room == null) {
            return null;
        }

        Booking booking = new Booking(bookingId, customer, room, numberOfNights);
        hotel.getBookings().add(booking);
        room.setAvailable(false);

        return booking;
    }
}
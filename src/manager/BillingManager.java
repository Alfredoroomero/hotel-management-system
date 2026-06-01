package manager;

import model.Booking;
import model.Hotel;
import model.Invoice;

//this class handles invoice and billing operations
public class BillingManager {

    //generates an invoice for an aexisting active booking
    public Invoice generateInvoice(Hotel hotel, BookingManager bookingManager, String invoiceId, String bookingId){

        Booking booking = bookingManager.findBookingById(hotel, bookingId);

        if(booking ==null){
            return null;
        }

        if(booking.getStatus().equals("CANCELLED")){
            return null;
        }

        return new Invoice(invoiceId, booking);
    }
    
}

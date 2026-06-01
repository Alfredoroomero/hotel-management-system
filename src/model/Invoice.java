package model;

//This class represents a simple invoice for a booking
public class Invoice {
        
    private String invoiceId;
    private Booking booking;
    private double totalAmount;

    //creates an invoice using booking information
    public Invoice(String invoiceId, Booking booking){

        this.invoiceId = invoiceId;
        this.booking = booking;
        this.totalAmount = booking.getTotalPrice();
    }

    public String getinvoiceId(){
        return invoiceId;
    }

    public Booking getBooking(){
        return booking;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    @Override
    public String toString() {

        return "Invoice ID: " + invoiceId +
                " | Booking ID: " + booking.getBookingId() +
                " | Customer: " + booking.getCustomer().getName() +
                " | Room: " + booking.getRoom().getRoomNumber() +
                " | Nigths: " + booking.getNumberOfNights() +
                " | Total Amount: " + totalAmount;
    }

}

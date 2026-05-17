package model;

//This class represents a booking made by a customer.
public class Booking {

    private String bookingId;
    private Customer customer;
    private Room room;
    private int numberOfNights;
    private double totalPrice;
    private String status;

    //Creates a booking and calculates its total price.
    public Booking(String bookingId, Customer customer, Room room, int numberOfNights){

        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.numberOfNights = numberOfNights;
        this.totalPrice = room.getPricePerNight() * numberOfNights;
        this.status = "ACTIVE";
    }

    public String getBookingId(){
        return bookingId;
    }

    public Customer getCustomer(){
        return customer;
    }

    public Room getRoom(){
        return room;
    }

    public int getNumberOfNights(){
        return numberOfNights;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public String getStatus(){
        return status;
    }

    //Updates the status of the booking.
    public void setStatus(String status){
        this.status = status;
    }

    //Cancels the booking and makes the room available again.
    public void cancelBooking(){
        
        this.status = "CANCELLED";
        this.room.setAvailable(true);
    }

    @Override
    public String toString(){
        
        return "Booking ID: " + bookingId +
               " | Customer: " + customer.getName() +
               " | Room: " + room.getRoomNumber() +
               " | Nights: " + numberOfNights +
               " | Total price: " + totalPrice +
               " | Status: " + status;
    }
}
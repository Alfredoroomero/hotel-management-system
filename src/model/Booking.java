package model;

//This class represents a booking made by a customer.
public class Booking {

    private String bookingId;
    private Customer customer;
    private Room room;
    private int numberOfNights;
    private double totalPrice;

    //Creates a booking and calculates its total price.
    public Booking(String bookingId, Customer customer, Room room, int numberOfNights){

        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.numberOfNights = numberOfNights;
        this.totalPrice = room.getPricePerNight() * numberOfNights;
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

    @Override
    public String toString(){
        
        return "Booking ID: " + bookingId +
               " | Customer: " + customer.getName() +
               " | Room: " + room.getRoomNumber() +
               " | Nights: " + numberOfNights +
               " | Total price: " + totalPrice;
    }
}
package model;

import java.util.ArrayList;

//This class represents the hotel and stores rooms and bookings.
public class Hotel {

    private String hotelName;
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;

    //Creates a hotel with empty lists of rooms and bookings.
    public Hotel(String hotelName){

        this.hotelName = hotelName;
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public String getHotelName(){
        return hotelName;
    }

    //Adds a new room to the hotel.
    public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public ArrayList<Booking> getBookings(){
        return bookings;
    }

    // Searches for an available room by its number.
    public Room findAvailableRoom(int roomNumber){

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }

    //Creates a booking if the room is available.
    public Booking createBooking(String bookingId, Customer customer, int roomNumber, int numberOfNights){

        Room room = findAvailableRoom(roomNumber);

        if (room == null){
            return null;
        }

        Booking booking = new Booking(bookingId, customer, room, numberOfNights);
        bookings.add(booking);
        room.setAvailable(false);
        return booking;
    }

    // Prints all rooms of the hotel.
    public void showRooms(){

        for (Room room : rooms){

            System.out.println(room);
        }
    }

    //Prints all bookings of the hotel.
    public void showBookings(){

        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}
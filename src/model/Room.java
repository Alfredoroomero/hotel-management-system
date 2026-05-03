package model;

//This class represents a hotel room.
public class Room {

    private int roomNumber;
    private String type;
    private double pricePerNight;
    private boolean available;

    //Creates a room with basic information.
    public Room(int roomNumber, String type, double pricePerNight){

        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.available = true;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public String getType(){
        return type;
    }

    public double getPricePerNight(){
        return pricePerNight;
    }

    public boolean isAvailable(){
        return available;
    }

    //Updates the availability of the room.
    public void setAvailable(boolean available){
        this.available = available;
    }

    @Override
    public String toString(){
        
        return "Room " + roomNumber +
               " | Type: " + type +
               " | Price per night: " + pricePerNight +
               " | Available: " + available;
    }
}
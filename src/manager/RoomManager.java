package manager;

import model.Hotel;
import model.Room;

// This class handles room-related operations.
public class RoomManager{

    // Adds a new room to the hotel.
    public void addRoom(Hotel hotel, Room room){
        hotel.addRoom(room);
    }

    // Shows all rooms in the hotel.
    public void showRooms(Hotel hotel){
        hotel.showRooms();
    }

    // Finds an available room by its number.
    public Room findAvailableRoom(Hotel hotel, int roomNumber){
        return hotel.findAvailableRoom(roomNumber);
    }
}
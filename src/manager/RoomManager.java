package manager;

import model.Hotel;
import model.Room;

// This class handles room-related operations.
public class RoomManager{

    // Adds a new room to the hotel if the room is not already used.
    public boolean addRoom(Hotel hotel, Room room){
        
        if (findAvailableRoom(hotel, room.getRoomNumber()) != null){

            return false;
        }

        hotel.addRoom(room);
        return true;
    }

    // Shows all rooms in the hotel.
    public void showRooms(Hotel hotel){
        hotel.showRooms();
    }

    // Finds a room by its number.
    public Room findRoomByNumber(Hotel hotel, int roomNumber){

        for (Room room : hotel.getRooms()){

            if (room.getRoomNumber() == roomNumber){
                return room;
            }
        }

        return null;
    }

    // Finds an available room by its number.
    public Room findAvailableRoom(Hotel hotel, int roomNumber){
        return hotel.findAvailableRoom(roomNumber);
    }

    // Shows only available rooms.
    public void showAvailableRooms(Hotel hotel){

        for (Room room : hotel.getRooms()){

            if (room.isAvailable()){
                System.out.println(room);
            }
        }
    }
}
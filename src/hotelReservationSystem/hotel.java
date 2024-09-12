package hotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class hotel 
{
    List<room> rooms;
    private List<booking> bookings;

    public hotel() 
    {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addRoom(room room) 
    {
        rooms.add(room);
    }

    public List<room> getAvailableRooms() 
    {
        List<room> availableRooms = new ArrayList<>();
        for (room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public void makeReservation(room room, String guestName) 
    {
        booking booking = new booking(room, guestName);
        bookings.add(booking);
        room.setAvailable(false);
    }

    public List<booking> getBookings() 
    {
        return bookings;
    }
}

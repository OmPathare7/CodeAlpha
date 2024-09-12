package hotelReservationSystem;

public class room 
{
    private int roomNumber;
    private String category;
    private boolean isAvailable;

    public room(int roomNumber, String category)
    {
        this.roomNumber = roomNumber;
        this.category = category;
        this.isAvailable = true;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public String getCategory()
    {
        return category;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void setAvailable(boolean available)
    {
        isAvailable = available;
    }
}

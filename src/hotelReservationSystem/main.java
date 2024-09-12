package hotelReservationSystem;

import java.util.Scanner;
import java.util.List;

public class main 
{
    public static void main(String[] args) 
    {
        hotel hotel = new hotel();

        // Add some rooms to the hotel
        hotel.addRoom(new room(1, "Single"));
        hotel.addRoom(new room(2, "Double"));
        hotel.addRoom(new room(3, "Suite"));

        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("1. Search for available rooms");
            System.out.println("2. Make a reservation");
            System.out.println("3. View booking details");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    List<room> availableRooms = hotel.getAvailableRooms();
                    System.out.println("Available rooms:");
                    for (room room : availableRooms) {
                        System.out.println("Room " + room.getRoomNumber() + " - " + room.getCategory());
                    }
                    break;
                case 2:
                    System.out.println("Enter room number:");
                    int roomNumber = scanner.nextInt();
                    System.out.println("Enter guest name:");
                    String guestName = scanner.next();
                    room room = findRoom(hotel, roomNumber);
                    if (room != null && room.isAvailable()) {
                        hotel.makeReservation(room, guestName);
                        System.out.println("Reservation made successfully!");
                    } else {
                        System.out.println("Room not available or does not exist.");
                    }
                    break;
                case 3:
                    List<booking> bookings = hotel.getBookings();
                    System.out.println("Bookings:");
                    for (booking booking : bookings) {
                        System.out.println("Room " + booking.getRoom().getRoomNumber() + " - " + booking.getGuestName());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static room findRoom(hotel hotel, int roomNumber) 
    {
        for (room room : hotel.rooms) 
        {
            if (room.getRoomNumber() == roomNumber) 
            {
                return room;
            }
        }
        return null;
    }
}

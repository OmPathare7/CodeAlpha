package travelPlanner;

import java.time.LocalDate;
import java.util.Scanner;

public class main 
{
 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter start date (yyyy-mm-dd):");
     String[] startDateArray = scanner.next().split("-");
     LocalDate startDate = LocalDate.of(Integer.parseInt(startDateArray[0]), Integer.parseInt(startDateArray[1]), Integer.parseInt(startDateArray[2]));

     System.out.println("Enter end date (yyyy-mm-dd):");
     String[] endDateArray = scanner.next().split("-");
     LocalDate endDate = LocalDate.of(Integer.parseInt(endDateArray[0]), Integer.parseInt(endDateArray[1]), Integer.parseInt(endDateArray[2]));

     System.out.println("Enter budget:");
     double budget = scanner.nextDouble();

     iternary itinerary = new iternary(startDate, endDate, budget);

     while (true) {
         System.out.println("1. Add destination");
         System.out.println("2. View itinerary");
         System.out.println("3. Get weather information");
         System.out.println("4. Calculate budget");
         System.out.println("5. Exit");

         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.println("Enter destination name:");
                 String name = scanner.next();
                 System.out.println("Enter destination location:");
                 String location = scanner.next();
                 System.out.println("Enter latitude:");
                 double latitude = scanner.nextDouble();
                 System.out.println("Enter longitude:");
                 double longitude = scanner.nextDouble();

                 destination destination = new destination(name, location, latitude, longitude);
                 itinerary.addDestination(destination);
                 break;
             case 2:
                 System.out.println("Itinerary:");
                 for (destination destination1 : itinerary.getDestinations()) {
                     System.out.println("Destination: " + destination1.getName());
                     System.out.println("Location: " + destination1.getLocation());
                     System.out.println("Latitude: " + destination1.getLatitude());
                     System.out.println("Longitude: " + destination1.getLongitude());
                 }
                 break;
             case 3:
                 System.out.println("Enter destination name:");
                 String destinationName = scanner.next();
                 for (destination destination1 : itinerary.getDestinations()) {
                     if (destination1.getName().equals(destinationName)) {
                         // Simulating weather information
                         weather weather = new weather("Sunny", 25.0);
                         System.out.println("Weather condition: " + weather.getCondition());
                         System.out.println("Temperature: " + weather.getTemperature());
                     }
                 }
                 break;
             case 4:
                 System.out.println("Budget: " + itinerary.getBudget());
                 break;
             case 5:
                 System.exit(0);
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     }
 }
}
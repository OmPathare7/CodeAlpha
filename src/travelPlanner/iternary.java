package travelPlanner;


//Itinerary Class
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class iternary {
private List<destination> destinations;
private LocalDate startDate;
private LocalDate endDate;
private double budget;

public iternary(LocalDate startDate, LocalDate endDate, double budget) {
   this.destinations = new ArrayList<>();
   this.startDate = startDate;
   this.endDate = endDate;
   this.budget = budget;
}

public void addDestination(destination destination) {
   destinations.add(destination);
}

public List<destination> getDestinations() {
   return destinations;
}

public LocalDate getStartDate() {
   return startDate;
}

public LocalDate getEndDate() {
   return endDate;
}

public double getBudget() {
   return budget;
}
}


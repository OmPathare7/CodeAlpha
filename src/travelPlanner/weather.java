package travelPlanner;

//Weather Class
public class weather 
{
private String condition;
private double temperature;

public weather(String condition, double temperature) {
   this.condition = condition;
   this.temperature = temperature;
}

public String getCondition() {
   return condition;
}

public double getTemperature() {
   return temperature;
}
}


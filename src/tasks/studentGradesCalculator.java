package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class studentGradesCalculator 
{
	    public static void main(String[] args) 
	    {
	        ArrayList<Double> grades = new ArrayList<>();
	        Scanner sc= new Scanner(System.in);

	        System.out.println("Enter the total number of students:");
	        int totalStudents = sc.nextInt();
	        
	        if (totalStudents>0) 
	        {
	        	for (int i = 0; i < totalStudents; i++) 
	        	{
		            System.out.println("Enter grade for student " + (i + 1) + ":");
		            double grade = sc.nextDouble();
		            if (grade>0) 
		            {
		            	grades.add(grade);
					}
		            else
		            {
		            	System.out.println("INVALID NUMBER, INSERT AGAIN");
		            	grades.clear();
		            	break;
		            }
		        }
	        	float average = Average(grades);
		        double highest = Highest(grades);
		        double lowest = Lowest(grades);

		        System.out.println("Average grade: " + average);
		        System.out.println("Highest grade: " + highest);
		        System.out.println("Lowest grade: " + lowest);
			}
	        else 
	        {
				System.out.println("INVALID NUMBER");
			}
	        
}

//--------------------------------------------------------------------------------
	    
	    public static float Average(ArrayList<Double> grades) 
	    {
	        float sum = 0;
	        for (double grade : grades) 
	        {
	            sum += grade;
	        }
	        return sum / grades.size();
	    }

//--------------------------------------------------------------------------------
	    
	    public static double Highest(ArrayList<Double> grades) 
	    {
	        double highest = grades.get(0);
	        for (double grade : grades) 
	        {
	            if (grade > highest) 
	            {
	                highest = grade;
	            }
	        }
	        return highest;
	    }

	    
//--------------------------------------------------------------------------------
	    
	    public static double Lowest(ArrayList<Double> grades) 
	    {
	        double lowest = grades.get(0);
	        for (double grade : grades) 
	        {
	            if (grade < lowest) 
	            {
	                lowest = grade;
	            }
	        }
	        return lowest;
	    }
	}


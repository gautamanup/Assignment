package assignment1;
import java.util.*;

public class TemperatureConversion {

	public static void main (String[] args) {
	

      Scanner in = new Scanner(System.in);
		        
		        System.out.println("Enter temperature in Celsius: ");
		        double C = in.nextDouble();
		        
		       
		        double F = C * (9f / 5) + 32;
		        
		  
		        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit." +F);
		       
		        
		        System.out.println("Enter temperature in Fahrenheit");
		        double T = in.nextDouble(); //T= temperature in Fahrenheit
		        
		        double C1 = ((T - 32)*5)/9;  //C1 is temperature in Celcius
		        System.out.println(T+ "degree Fahrenheit is equal to " +C1+ " degree Celcius:" +C1);
		        		
		    }
		}



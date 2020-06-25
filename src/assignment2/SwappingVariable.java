package assignment2;
import java.util.*;


public class SwappingVariable {
	public static void main (String args []) {
		Scanner input = new Scanner (System.in);
		        System.out.println("--Before swap--");
		        
		        System.out.println("Enter First number" );
		        float first = input.nextFloat ();
		        System.out.println("Enter Second number" );
		        float second = input.nextFloat();

		        // Value of first is assigned to temporary
		        float temporary = first;

		        // Value of second is assigned to first
		        first = second;

		        // Value of temporary (which contains the initial value of first) is assigned to second
		        second = temporary;

		        System.out.println("--After swap--");
		        System.out.println("First number = " + first);
		        System.out.println("Second number = " + second);
		    
	System.out.println("Swapping without using any variable");
	
	        System.out.println("--Before swap--");
	        System.out.println("Enter First number" );
	        float first1 = input.nextFloat ();
	        System.out.println("Enter Second number" );
	        float second2 = input.nextFloat();
	        first1 = first1 - second2;
	        second2 = first1 + second2;
	        first1 = second2 - first1;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first1);
	        System.out.println("Second number = " + second2);
	    }
	}
		


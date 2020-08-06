package assignment2;
import java.util.*;

public class MathematicalFunction1 {
	public static void main (String args []) {
	/*	Scanner input = new Scanner (System.in);
		System.out.println("Enter the initival veloctiy");
		float u = input.nextFloat();
		System.out.println("Enter the time");
		float t= input.nextFloat();
		System.out.println("Enter the acceleration");
	float a= input.nextFloat();
		 
		float s = u*t+1/2*a*t*t;
		System.out.println("The distance travelled is:" +s);
		
	
		
		
	}

}
*/
		
		 
		 
		  Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input a number: ");
		  int num1 = in.nextInt();
		   
		  for (int i=0; i< 10; i++){
		   System.out.println(num1 + " x " + (i+1) + " = " + 
		     (num1 * (i+1)));
		  }
		 }
		}
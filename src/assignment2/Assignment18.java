package assignment2;
import java.util.*;

public class Assignment18 {

	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first number");
		int number1 = input.nextInt();
	System.out.println("Enter second number");
		int number2= input.nextInt();
		System.out.println("Enter first number");
		int number3 = input.nextInt();
		
		if (number1>number2 && number1>number3)
		
			System.out.println("number1 is the largest number");
			
		if (number2>number1 && number2>number3)
			
		
			System.out.println(" number 2is the largest number");
		
		if (number3>number1 && number3>number2)
			System.out.println("number 3 is the largest number");	
	}
}

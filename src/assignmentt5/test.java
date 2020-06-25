package assignmentt5;
import java.util.*;

public class test {
	
	public static void main (String[] args) {
	Assignment5 obj= new Assignment5 ();
	Scanner input = new Scanner(System.in);	
	String decision = " ";
	
	do {
		System.out.println("Select an operation to perform");
		String choice = input.next();
		
		switch(choice){ 
		case "table": { 
			System.out.println("Enter number to find the table");
			int n = input.nextInt();
			obj.printTable (n);		
			break;

		}
		case "factorial" : 
			System.out.println("Enter number to find the factorial");
			int n = input.nextInt();
			obj.Factorial(n);		
			break;
		
		case "prime" : 
			System.out.println("Enter number to find the factorial");
			 n = input.nextInt();
			Object ob;
					
			break;
		case "reverse" :
			System.out.println("Enter number to reverse");
			n= input.nextInt();
			obj.findReverse(n);
			break;
		case "Addition" :
			System.out.println("Enter digit to provide sum of each provided number ");
			n= input.nextInt();
			obj.Addition(n);
			break;
		
		default :
			System.out.println("wrong choice!");
	
		}
	System.out.println("Do you want to Continue?");
	decision = input.next();
	
	}while (decision.equals ("Yes"));
		

System.out.println("Okay.Thank you");
}
}

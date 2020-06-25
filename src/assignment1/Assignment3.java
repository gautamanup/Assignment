package assignment1;
import java.util.* ;


public class Assignment3 {
	public static void main (String args[])
	{
		int sum;
		float avg;
		int b;
		int c;
		System.out.println ("Enter two numbers ");
		Scanner in = new Scanner (System.in);
		b = in.nextInt();
		c = in.nextInt();
		sum = b+c ;
		System.out.println ("Sum of the two numbers is " + sum );
		avg = (b+c)/2 ;
		System.out.println ("Average of the two numbers is "  +avg);
		
		
	
	}

} 

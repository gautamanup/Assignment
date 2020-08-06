package assignment1;
import java.util.* ;


public class Assignment3 {
		public static void main (String []args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the two numbers for the sum and average");
		int a= input.nextInt();
		int b = input.nextInt();
		int sum= a+b;
		long average= (a+b)/2;
		System.out.println("The sum is " + sum + " And the average is " + average  );
		}
	}


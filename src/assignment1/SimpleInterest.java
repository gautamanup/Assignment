package assignment1;
import java.util.* ;

public class SimpleInterest {
	public static void main (String args []) {
		int P;
		int T;
		int R;
		int Simple_Interest;
		 System.out.println("Enter Principle, Rate and Time");
		
		Scanner input = new Scanner (System.in);
		P = input.nextInt();
		T = input.nextInt();
		R = input.nextInt();
		
		
		Simple_Interest = (P*T*R)/100 ;
		 System.out.println("The Simple Interest is "  + Simple_Interest);
		 
	}

}

package assignment2;
import java.util.Scanner;

public class Assignment15a {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer from 0-128");
		int number_given = scan.nextInt();
		char output = (char)number_given;
		System.out.println("Equivalent char for the give number is " + output);
	}

}

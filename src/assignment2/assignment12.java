package assignment2;



import java.util.Scanner;
public class assignment12 {

	public static void main(String[] args) {
		
		
		Scanner input  = new Scanner(System.in); 
		
		System.out.print(" Enter your Name: ");
		String name = input.nextLine();
		
		System.out.print("\n Enter your Nationality: ");
		String nationality = input.nextLine();
		
		System.out.print("\n Enter your Roll Number: ");
		int roll = input.nextInt(); 
		
		System.out.println("\n Name: " + name);
		System.out.println("\n Nationality: "+ nationality);
		System.out.println("\n Roll No: " + roll);
		
		input.close();
		
	}

}
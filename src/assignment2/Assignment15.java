package assignment2;


import java.util.Scanner;

public class Assignment15 {
	public static void main(String[] args) {
		byte c;
		System.out.print("Enter a character: ");
		c = (byte)nextChar(input);

	
		System.out.print("ASCII value of " + ((char)Byte.toUnsignedInt(c)) + " = " + c);
	}

	static Scanner input = new Scanner(System.in);

	
	public final static int nextChar(Scanner scanner) {
		
		int ret = scanner.next().charAt(0);
		scanner.reset();
		return ret; 
	}
}
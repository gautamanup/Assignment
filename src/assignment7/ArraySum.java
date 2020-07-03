package assignment7;
import java.util.*;

public class ArraySum{

	public static void main(String[] args) { 

		//System.out.println("Please enter the length of array?"); 
		Scanner scnr = new Scanner(System.in); 
		//int length = scnr.nextInt(); 
		int length= 5;
		int[] input = new int[length];
	
		System.out.println("Please enter elements of array"); 
		for (int i = 0; i < length; i++) {
			input[i] = scnr.nextInt(); }
		int total = sumOfElements(input);
		System.out.println("Sum of all elements of array is " + total); 
		scnr.close(); }

	public static int sumOfElements(int[] array) { 
		int sum = 0; 
		for (int i : array) { 
			sum = sum + i; } 
		return sum; 
		} 

		
	
	}

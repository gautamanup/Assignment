
package assignment4;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("\nEnter the number: ");
	int number = sc.nextInt();
		
		
		int sum =0, multiplication =1; 
		
		while(number !=0 )
		{
			int divisible = number%10; 
			number /= 10;
			sum += divisible; 
			multiplication *=  divisible;
		}
		
		
		System.out.println("\nThe sum of given number is: " + sum);
		System.out.println("\nThe multiplication of given number is: " + multiplication);

		sc.close();
	}

}
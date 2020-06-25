package assignment1;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		
		double pi= 3.14;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the radius:");
        double r =input.nextDouble();
        System.out.println("Enter the height:");
        double h=input.nextDouble();

           double  volume=(pi*r*r*h);

           System.out.println("volume of Cylinder is: " +volume);
		
		

	}

}

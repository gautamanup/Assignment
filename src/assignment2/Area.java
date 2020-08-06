package assignment2;
import java.util.*;
import java.lang.Math;
public class Area {

	public static void main (String args []) {
		Scanner in= new Scanner(System.in);
		float area;
		System.out.println("Enter the semi perimeter of triangle");
		float s = in.nextFloat();
	System.out.println("Enter the first side");
		float a= in.nextFloat();
		System.out.println("Enter the second side");
		float b= in.nextFloat();
		System.out.println("Enter the third side");
		float c= in.nextFloat();
	area= s*(s-a)*(s-b)*(s-c);
	
	System.out.println("The area of the triangle is " +Math.sqrt(area));
	} 
	
	
	}


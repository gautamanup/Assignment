package assignment1;
import java.util.* ;

public class Area {
public static void main (String args[]) {
	Scanner input = new Scanner (System.in);
	
	
	//Area of circle
	double pi = 3.14;
	System.out.println("Enter radius of circle");
	double radius = input.nextDouble ();
	double area_of_circle =  pi*radius*radius ;
	System.out.println("The area of Circle is " +area_of_circle);
	
	//Area of rectangle
	System.out.println("Enter the length of rectangle");
	System.out.println("Enter the breadth of rectangle");
	double length = input.nextDouble ();
	double breadth = input.nextDouble ();
	double area_of_rectangle = length*breadth ;
	System.out.println ("The area of rectangle is " +area_of_rectangle); 
	
	//Area of triangle
	System.out.println("Enter the base of triangle");
	System.out.println("Enter the height of the triangle");
	double base = input.nextDouble();
	double height = input.nextDouble();
	double area_of_triangle = (base*height)/2;
	System.out.println("The area of the triangle is  " +area_of_triangle);
	
		
	}

}

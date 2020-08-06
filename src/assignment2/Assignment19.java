package assignment2;
import java.util.*;
public class Assignment19
{
 public static void main(String args[]){
	 
 Scanner input = new Scanner (System.in);


 
System.out.println ("Enter first side of the triangle");
int a =input.nextInt ();

System.out.println ("Enter second side of the triangle");
int b= input.nextInt();

System.out.println ("Enter third side of the triangle");

int c = input.nextInt();

 if (a==b && b==c)
    System.out.println("The triangle is an equilateral triangle");
    if 		((a==b && b!=c && a!=c) 
    		|| (b==c && b!=a && c!=a) 
    		|| (c==a & c!=b && a!=b))
    	
    System.out.println("The triangle is an isosceles trianlge");
    if (a!=b && a!=c && b!=c)
    System.out.println("The triangle is a scalene trianlge");
}
}
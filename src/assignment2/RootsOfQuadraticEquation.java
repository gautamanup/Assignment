package assignment2;
import java.lang.Math;

import java.util.Scanner;
public class RootsOfQuadraticEquation {
   public static void main(String args[]){
    
	   double secondRoot = 0, firstRoot = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ::");
      double a = sc.nextDouble();

      System.out.println("Enter the value of b ::");
      double b = sc.nextDouble();

      System.out.println("Enter the value of c ::");
      double c = sc.nextDouble();

      double determinant = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
      System.out.println("The root is:" +determinant);
      

     
      }
   }

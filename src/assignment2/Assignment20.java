package assignment2;
import java.util.Scanner;
import java.lang.*;

public class Assignment20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        
        double first = input.nextDouble();
        double second = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;
System.out.println("The output is ");
        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;
    
            default:
            	
                return;
        }
        
        System.out.printf("%.1f %c %.1f = %.1f " , first, operator, second, result);
        
    }
}
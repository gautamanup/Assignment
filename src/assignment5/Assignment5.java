package assignment5;
import java.util.*;

import assignment4.Question28;

public class Assignment5 {

	public void Factorial (int n) {
		int result = 1;
        for(int i = 1; i <= n; ++i)
        {
          
            result *= i;
        }
        System.out.printf("Factorial of %d = %d", n, result);
	}


public void printTable (int n){
       int result;
    for(int i=1; i <= 10; i++)
    {
       result= n*1;
    	System.out.println(n+" * "+i+" = "+n*i);
    }
}
public void findReverse (int n) {
	int reversenum = 0;
	while( n != 0 )
    {
        reversenum = reversenum * 10;
        reversenum = reversenum + n%10;
        n = n/10;
    }

    System.out.println("Reverse of input number is: "+reversenum);
 }
    
    public void Addition (int n) {
    	int sum =0; 
		
		while(n !=0 )
		{
			int divisible = n%10; 
			n /= 10;
			sum += divisible; 
			
		}
		
		System.out.println("\nThe sum of given number is: " + sum);
		

    }

public boolean isPrime (int n) {
	boolean isPrimeNumber = true;
	for (int i=2; i<=n/2; i++) {
		if (n% i==0) {
			isPrimeNumber = false;
		break;
		}
	}
return isPrimeNumber;
}
}


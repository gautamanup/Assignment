
package assignment6;
import java.util.*;

public class Main {
	public static void main (String[] args) {

		int typeOfMeal, typeOfFood,  feeds, trayNeeded, leftOver; 
		double price, subTotalPrice, totalTax, totalTip, grandTotal, perPerson; 
		
		final double  TAXRATE = 0.07; 
		final double TIPRATE = 0.15; 
		
		
		TakeOutMethods obj = new TakeOutMethods(); 
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please specify order for number of people: ");
		int input = sc.nextInt(); 
		
		
		if (input < 10 )
		{
			System.out.println(" Number of people are invalid. Sorry  ");
			System.out.println("Invalid Program");
			return;
		}
		
			obj.displayMainMenu();
			
			System.out.print(" Please Specify your food type");
			typeOfMeal = sc.nextInt(); 
			
			switch(typeOfMeal) {
			
				case 1: 
					
						do {
							obj.displayItalianFoodMenu();	
							typeOfFood = sc.nextInt();
						 
							} while(typeOfFood > 3 || typeOfFood <1);
					
					
						if (typeOfFood == 1)
						{
							price = 17.99;
							feeds = 5; 
						}
						else if (typeOfFood ==2)
						{
							price = 15.99;
							feeds = 7; 
						}
						else 
						{
							price =12.99; 
							feeds = 4;
						}
						
						break;
						
				case 2: 
					
						do	{
							obj.displayChineseFoodMenu();
							typeOfFood = sc.nextInt();
						
							}while(typeOfFood > 3 || typeOfFood < 1);
					
					
						if (typeOfFood == 1)
						{
							feeds = 7; 
							price= 18.99;
						}
						else if (typeOfFood ==2)
						{
							feeds = 7; 
							price =18.99;
						}
						else 
						{
							feeds = 5;
							price = 10.99;
						}
					
						break;
						
				case 3: 
						do 
						{
							obj.displayAmericanFoodMenu();
							
							typeOfFood = sc.nextInt();
							
						}while(typeOfFood > 3  || typeOfFood < 1);
						
						
						if (typeOfFood == 1)
						{
							feeds = 8; 
							price = 21.99;
						}
						else if (typeOfFood ==2)
						{
								feeds = 5; 
								price = 22.99;
						}
						else 
						{
								feeds = 10;
								price = 26.99;
						}
						break; 
				default: 
						System.out.println("\n\n\t You entered invalid option. Thank you.");
						System.out.println("Invalid Program ");
						return; 
			}
			
			
			trayNeeded = obj.determineTrays(input, feeds); 
			
 
			subTotalPrice = obj.getSubtotal(price, trayNeeded); 
			

			totalTax = obj.getTax(subTotalPrice, TAXRATE);
			

			totalTip = obj.getTip(subTotalPrice, TIPRATE);
			

			grandTotal = obj.getGrandTotal(subTotalPrice, totalTax, totalTip);
			

			perPerson = obj.pricePerPerson(grandTotal, input);
			
			
			leftOver = obj.determineLeftOvers(feeds, trayNeeded, input);
			
			
			

			
			System.out.printf("\n\t You need %d trays "
							   + "\n\n \t Feeds: %d " 
							   + "\n\n \t Price for %d  people ( %d trays): %.2f" 
							   + "\n\n \t Tax: %.2f "
							   + "\n\n \t Tip: %.2f " 
							   + "\n\n \t Total (food, tax, tip): %.2f" 
							   + "\n\n \t Price per person: %.2f"
							   + "\n\n \t Leftover servings for the delivery person: %d"  
							   , trayNeeded, feeds,  input, trayNeeded, 
							   subTotalPrice , totalTax  , totalTip, 
							   grandTotal , perPerson, leftOver);
			
			System.out.println("Thank you for choosing our restaurant");
			
				
		}


}

	
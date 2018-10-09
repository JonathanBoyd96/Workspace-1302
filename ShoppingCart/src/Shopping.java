// Shopping.java
// Jonathan Boyd
// CSCI 1302
// Shopping Practice
// 01/21/15

import java.util.Scanner;

public class Shopping
{
	public static void main (String[] args)
	{

		String itemName;
		double itemPrice;
		int quantity;

		Scanner scan = new Scanner (System.in);

		ShoppingCart cart = new ShoppingCart();
		
		System.out.print ("Enter the name of the item or press \"Q\" to quit: "); 
		itemName = scan.nextLine();
		
		while (!itemName.equalsIgnoreCase ("q"))
	     {

			System.out.print ("Enter the unit price: ");
			itemPrice = scan.nextDouble();

			System.out.print ("Enter the quantity: ");
			quantity = scan.nextInt();
			
			scan.nextLine();
			
			cart.addToCart(itemName, itemPrice, quantity);
			
			System.out.println (cart.toString());

			System.out.print ("Enter the name of the item or press \"Q\" to quit: "); 
			itemName = scan.nextLine();
			
			
	     }
	}
}
// Conner Calhoun
// Miles Johnson
// Ethan Hills
// Jonathan Boyd
// Clinton Willis
import java.util.Scanner;

public class PocketMain
{
	
	public static void main (String[] args) throws NoSuchCoin
	{
		Pocket2 pocket = new Pocket2();
		
		Scanner scan = new Scanner(System.in);
		String response;
		int number;
		String coinType = null;
		String keepGoing = "y";
		String keepGoing2 = "y";
		
		
		while(keepGoing == "y")
		{
			try
			{
				System.out.println("Enter a coin type('p', 'n', 'd', 'q') or \"xxx\" to quit: ");
				coinType = scan.nextLine();
					
				if (!coinType.equals("p")&&!coinType.equals("n")&&!coinType.equals("d")&&!coinType.equals("q")&&!coinType.equals("xxx"))	
				{
					throw (new NoSuchCoin("Not a valid coin."));
				}
				
				if(coinType.equals("p")||coinType.equals("n")||coinType.equals("d")||coinType.equals("q")||coinType.equals("xxx"))
					keepGoing = "n";
			}
			catch(NoSuchCoin issue)
			{
				System.out.println("Invalid coin type, please try again");
				coinType = null;
			}
			
		}
		
		
		while(!coinType.equalsIgnoreCase("xxx"))
		{	
			
			if (coinType.equalsIgnoreCase("p"))
			{
				System.out.println("Add or Remove?:");
				response = scan.nextLine();
				
				System.out.println("How many?:");
				number = scan.nextInt();
						
				if(response.equalsIgnoreCase("add"))
					pocket.addPennies(number);
				else if(response.equalsIgnoreCase("remove"))
					pocket.removePennies(number);
				
				
			}
			
			if (coinType.equalsIgnoreCase("n"))
			{
				System.out.println("Add or Remove?:");
				response = scan.nextLine();
				
				System.out.println("How many?:");
				number = scan.nextInt();
				
				if(response.equalsIgnoreCase("add"))
					pocket.addNickels(number);
				else if(response.equalsIgnoreCase("remove"))
					pocket.removeNickels(number);
			}
			
			if (coinType.equalsIgnoreCase("d"))
			{
				System.out.println("Add or Remove?:");
				response = scan.nextLine();
				
				System.out.println("How many?:");
				number = scan.nextInt();
				
				if(response.equalsIgnoreCase("add"))
					pocket.addDimes(number);
				else if(response.equalsIgnoreCase("remove"))
					pocket.removeDimes(number);
			}
			
			if (coinType.equalsIgnoreCase("q"))
			{
				System.out.println("Add or Remove?:");
				response = scan.nextLine();
				
				System.out.println("How many?:");
				number = scan.nextInt();
				
				if(response.equalsIgnoreCase("add"))
					pocket.addQuarters(number);
				else if(response.equalsIgnoreCase("remove"))
					pocket.removeQuarters(number);
				
			}
			
			

			// resetting scanner
			scan.nextLine();
			
			while(keepGoing2 == "y")
			{
				try
				{
					System.out.println("Enter a coin type('p', 'n', 'd', 'q') or \"xxx\" to quit: ");
					coinType = scan.nextLine();
						
					if (!coinType.equals("p")&&!coinType.equals("n")&&!coinType.equals("d")&&!coinType.equals("q")&&!coinType.equals("xxx"))	
					{
						throw (new NoSuchCoin("Not a valid coin."));
					}
					
					if(coinType.equals("p")||coinType.equals("n")||coinType.equals("d")||coinType.equals("q")||coinType.equals("xxx"))
						keepGoing2 = "n";
				}
				catch(NoSuchCoin issue)
				{
					System.out.println("Invalid coin type, please try again");
					coinType = null;
				}
				
			}
			keepGoing2 = "y"; // These fix the problem we had. They reset keepgoing and keepgoing2 to "y" so it runs the while loops again
			keepGoing = "y";
		}
			
		System.out.println(pocket.toString());
		
		System.out.println("Thanks!");
		
		
	}
	
}

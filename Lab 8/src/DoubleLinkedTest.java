//***********************************************************
//DoubleLinkedTest.java
//
//Driver to test DoubleLinked methods.
//***********************************************************
import java.util.Scanner;
public class DoubleLinkedTest
{
	private static Scanner scan;
	private static DoubleLinked list = new DoubleLinked();
	//----------------------------------------------------------------
	// Creates a list, then repeatedly prints the menu and does what
	// the user asks until they quit.
	//----------------------------------------------------------------
	public static void main(String[] args)
	{
		scan = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0)
		{
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}
	//---------------------------------------
	// Does what the menu item calls for.
	//---------------------------------------
	public static void dispatch(int choice)
	{
		int newVal;
		switch(choice)
		{
			case 0:
			System.out.println("Bye!");
			break;
			case 1: //print
			System.out.println("** List elements **");
			list.print();
			break;
			case 2: //add to front
			System.out.println("Enter integer to add to front");
			newVal = scan.nextInt();
			list.addToFront(newVal);
			break;
			case 3: //add to end
				System.out.println("Enter integer to add to end");
				newVal = scan.nextInt();
				list.addToEnd(newVal);
				break;
			case 4: //remove first element
				list.removeFirst();
				break;
			case 5:
				list.removeLast();
				break;
			case 6:
				System.out.println("Enter a value to remove");
				int oldVal=scan.nextInt();
				list.remove(oldVal);
			default:
			System.out.println("Sorry, invalid choice");
		}
	}
	//-----------------------------------------
	// Prints the user's choices
	//-----------------------------------------
	public static void printMenu()
	{
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Print list");
		System.out.println("2: Add an integer to the front of the list");
		System.out.println("3: Add an integer to the end of the list");
		System.out.println("4: Remove an integer from the front of the list");
		System.out.println("5: Remove the last value");
		System.out.println("6: Replace first occurence of old value");
		System.out.print("\nEnter your choice: ");
	}
}

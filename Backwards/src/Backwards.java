// ******************************************************************
// Backwards.java
//
// Uses a recursive method to print a string backwards.
// ******************************************************************
import java.util.Scanner;
public class Backwards
{
//--------------------------------------------------------------
// Reads a string from the user and prints it backwards.
//--------------------------------------------------------------
	public static void main(String[] args)
		{
		String msg;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		msg = scan.nextLine();
		System.out.print("\nThe string backwards: "+ printBackwards(msg));
		printBackwards(msg);
		System.out.println();
		}
//---------------------------------------------------------------
// Takes a string and recursively prints it backwards.
//---------------------------------------------------------------
	public static String printBackwards(String s)
		{
		char c = s.charAt(s.length()-1);
        if(s.length() == 1) return Character.toString(c);   

        return c + printBackwards(s.substring(0,s.length()-1));
		
		}
	public static int stringLength(String word)
		{
			if(word.equals("")|| word == null)
				return 0;
		
			else
				return stringLength(word.substring(1)) +1;
		}
}
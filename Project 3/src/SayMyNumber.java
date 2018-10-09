// Jonathan Boyd
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class SayMyNumber
{
	final private  static String[] units = {"Zero","One","Two","Three","Four",
	    "Five","Six","Seven","Eight","Nine","Ten",
	    "Eleven","Twelve","Thirteen","Fourteen","Fifteen",
	    "Sixteen","Seventeen","Eighteen","Nineteen"};
	final private static String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
	    "Sixty","Seventy","Eighty","Ninety"};

	public static String convert(long i) 
	{	
		 if( i < 20)  return units[(int) i];
		    if( i < 100) return tens[(int) (i/10)] + ((i % 10 > 0)? " " + convert(i % 10):"");
		    if( i < 1000) return convert(i/100) + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");
		    if( i < 1000000) return convert(i / 1000) + " Thousand " + ((i % 1000 > 0)? " " + convert(i % 1000):"") ;
		    if( i < 1000000000) return convert(i / 1000000)+ " Million " + ((i % 1000000 > 0)? " " + convert(i % 1000000):"") ;
		    if( i < (1000000000000L)) return convert(i / 1000000000)+ " Billion " + ((i % 1000000000 > 0)? " " + convert(i % 1000000000):"") ;
		    if( i < (1000000000000000L)) return convert(i / 1000000000000L)+ " Trillion " + ((i % 1000000000000L > 0)? " " + convert(i % 1000000000000L):"") ;
		    if( i < (1000000000000000000L)) return convert(i / 1000000000000000L)+ " Qaudrillion " + ((i % 1000000000000000L > 0)? " " + convert(i % 1000000000000000L):"") ;
		    return convert(i / 1000000000000000000L) + " Quintillion " + ((i % 1000000000000000000L > 0)? " " + convert(i % 1000000000000000000L):"") ;
	}
	
	public static void main(String[] args) throws IOException, URISyntaxException
	{
		
		
		Scanner scan = new Scanner(System.in);
		String hold;
		long s = 0;
		String choice = null;
do{
		
		System.out.println ("Enter a number between one and 9.2 Quintillion: ");
		try
		{
		 s = scan.nextLong();
		 hold=convert(s);
			System.out.println (hold);
			Desktop.getDesktop().browse(new URI("http://tts-api.com/tts.mp3?q="+hold.replace(" ","+")));
		}
	catch(InputMismatchException newException)
		{
		System.out.println("You entered a letter or your number is too big. Please enter positive numbers!");
		}
		catch(ArrayIndexOutOfBoundsException newException)
	{
		System.out.println("You entered negative numbers. Please enter positive numbers! ");
		}
		finally
		{
			System.out.println("Do you want to try again?");
			choice=scan.next();
		}
}while(choice.equalsIgnoreCase("y") ||choice.equalsIgnoreCase("yes"));
		
		
	}

}



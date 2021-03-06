// Jonathan Boyd
// Hunter Savage
// Soly Im
// Garrett Marschke
// Ethan D. Hills

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

	public static String convert(int i) 
	{
		    if( i < 20)  return units[i];
		    if( i < 100) return tens[i/10] + ((i % 10 > 0)? " " + convert(i % 10):"");
		    if( i < 1000) return units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");
		    if( i < 1000000) return convert(i / 1000) + " Thousand " + ((i % 1000 > 0)? " " + convert(i % 1000):"") ;
		    if( i < 1000000000) return convert(i / 1000000)+ " Million " + ((i % 1000000 > 0)? " " + convert(i % 1000000):"") ;
		    return convert(i / 1000000000) + " Billion " + ((i % 1000000000 > 0)? " " + convert(i % 1000000000):"") ;
	}
	
	public static void main(String[] args) throws IOException, URISyntaxException
	{
		
		
		Scanner scan = new Scanner(System.in);
		String hold;
		
		System.out.println ("Enter a number between one and 2.1 billion: ");
		int s = scan.nextInt();
		hold=convert(s);
		
		
		
		
		System.out.println (hold);
		Desktop.getDesktop().browse(new URI("http://tts-api.com/tts.mp3?q="+hold.replace(" ","+")));
		
		
	}

}

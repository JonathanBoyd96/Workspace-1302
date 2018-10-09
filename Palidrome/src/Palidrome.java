import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Palidrome 
{
	public static boolean isPal(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true; 
        
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));

        return false;
    }
	
	public static void main(String[] args) throws IOException, URISyntaxException
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Enter a combination of letters to find out if it is a palindrome: ");
		String s = scan.nextLine();
		
		if(isPal(s))
            s = " is a palindrome";
        else
            s = "is not a palindrome";
		
		Desktop.getDesktop().browse(new URI("http://tts-api.com/tts.mp3?q="+s.replace(" ", "+")));
	}

}
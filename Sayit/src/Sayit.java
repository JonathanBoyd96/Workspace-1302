import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Sayit 
{
	public static void main(String[] args) throws IOException, URISyntaxException
	{
		System.out.println ("Enter a combination of letters to find out if it is a palindrome: ");
		String s = "Hello World";
		
		Desktop.getDesktop().browse(new URI("http://tts-api.com/tts.mp3?q="+s.replace(" ", "+")));
	}

}

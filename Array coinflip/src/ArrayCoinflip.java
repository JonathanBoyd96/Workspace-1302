// ArrayCoinflip.java
// Jonathan Boyd
// CSCI 1302
// PracticeLab
// 01/14/15
import java.util.Random;

public class ArrayCoinflip 
{

	public static void main(String[]args)
	{
		int[] coinA, coinB;
		int headcount = 0, tailcount = 0, noMatch = 0;
		Random gen = new Random();
		coinA = new int [1000];
		coinB = new int [1000];
		
		for(int i = 0; i<coinA.length;i++)
		{
			
			coinA[i] = gen.nextInt(2);
			coinB[i] = gen.nextInt(2);
			
		}
		
		for(int i = 0; i<coinA.length;i++)
		{
			
			if(coinA[i]==coinB[i])
			{
				if(coinA[i]==0)
					headcount++;
				else
					tailcount++;
	
			}
			else 
				noMatch++;
			
		}
		
		System.out.println("The number of heads flipped was: " + headcount);
		System.out.println("The number of tails flipped was: " + tailcount);
		System.out.println("The number of times no match occured was: " + noMatch);
		
		for(int i = 0; i<coinA.length;i++)
		{
			
			coinA[i] = gen.nextInt(2);
			coinB[i] = gen.nextInt(2);
			
		}
		
		headcount = 0;
		tailcount = 0;
		noMatch = 0;
		
		
		for(int i = 0; i<coinA.length;i++)
		{
			
			if(coinA[i]==coinB[coinB.length -i -1])
			{
				if(coinA[i]==0)
					headcount++;
				
				else
					tailcount++;
	
			}
			else 
				noMatch++;
			
		}
		
		System.out.println("\nThe number of heads flipped was: " + headcount);
		System.out.println("The number of tails flipped was: " + tailcount);
		System.out.println("The number of times no match occured was: " + noMatch);
		
	}

}

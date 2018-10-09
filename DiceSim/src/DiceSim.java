// DiceSim.java
// Jonathan Boyd
// CSCI 1302
// Lab #1
// 01/19/15
import java.util.Random;

public class DiceSim
{

	public static void main(String[]args)
	{
		int[] die1, die2, die3, die4, die5;
		int Yahtzeecount = 0;
		int Foakcount = 0;
		int Fhcount = 0;
		
		Random gen = new Random();
		die1 = new int [7776];
		die2 = new int [7776];
		die3 = new int [7776];
		die4 = new int [7776];
		die5 = new int [7776];
		
		for(int i = 0; i<die1.length;i++)
		{
			
			die1[i] = gen.nextInt(6)+1;
			die2[i] = gen.nextInt(6)+1;
			die3[i] = gen.nextInt(6)+1;
			die4[i] = gen.nextInt(6)+1;
			die5[i] = gen.nextInt(6)+1;
			
			//System.out.println(die1[i]);
			
		}
		
		for(int i = 0; i<die1.length;i++) // Four of a kind
		{
			if(die1[i]==die2[i] && die2[i]==die3[i] && die3[i]==die4[i] && die1[i]!=die5[i])
			{
				Foakcount++;
			}
			
			else if(die1[i]==die2[i] && die2[i]==die3[i] && die3[i]==die5[i] && die1[i]!=die4[i])
			{
				Foakcount++;
			}
			
			else if(die1[i]==die2[i] && die2[i]==die4[i] && die4[i]==die5[i] && die1[i]!=die3[i])
			{
				Foakcount++;
			}
			
			if(die1[i]==die3[i] && die3[i]==die4[i] && die4[i]==die5[i] && die1[i]!=die2[i])
			{
				Foakcount++;
			}
			
			if(die2[i]==die3[i] && die3[i]==die4[i] && die4[i]==die5[i] && die5[i]!=die1[i])
			{
				Foakcount++;
			}
		}
		
		
		for(int i = 0; i<die1.length;i++) // Full house
		{
			if(die1[i]==die2[i] && die2[i]==die3[i] && die4[i]==die5[i] && die3[i]!=die4[i])
			{
				Fhcount++;
			}
			
			else if(die2[i]==die3[i] && die3[i]==die4[i] && die1[i]==die5[i] && die4[i]!=die1[i])
			{
				Fhcount++;
			}
			else if(die3[i]==die4[i] && die4[i]==die5[i] && die1[i]==die2[i] && die5[i]!=die1[i])
			{
				Fhcount++;
			}
			
			else if(die4[i]==die5[i] && die5[i]==die1[i] && die2[i]==die3[i] && die1[i]!=die2[i])
			{
				Fhcount++;
			}
			
			if(die5[i]==die1[i] && die1[i]==die2[i] && die3[i]==die4[i] && die2[i]!=die3[i])
			{
				Fhcount++;
			}
		}
		
		
		for(int i = 0; i<die1.length;i++) // Yahtzee
		{
			
			if(die1[i]==die2[i])
			{
				if(die2[i]==die3[i])
				{
					if(die3[i]==die4[i])
					{
						if(die4[i]==die5[i])
						{
							Yahtzeecount++;
						}
					}
				}
	
			}
			
		}
		
		System.out.println("Four of a kind occured: " + Foakcount + " times");
		System.out.println("Full house occured: " + Fhcount + " times");
		System.out.println("Yahtzee occured: " + Yahtzeecount + " times");
		
		
	}

}

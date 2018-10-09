// ExtraCredit.java
// Jonathan Boyd
// CSCI 1302
// Lab #1
// 01/19/15
import java.util.Random;

public class ExtraCredit
{

	public static void main(String[]args)
	{
		int[] die1, die2, die3, die4, die5;
		
		eCredit file = new eCredit();
		
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
		
		
		
		
		System.out.println("Four of a kind occured: " + file.isFourOfAKind(die1, die2, die3, die4, die5) + " times");
		System.out.println("Full house occured: " + file.isFullHouse(die1, die2, die3, die4, die5) + " times");
		System.out.println("Yahtzee occured: " + file.isYahtzees(die1, die2, die3, die4, die5) + " times");
		
		
	}

}

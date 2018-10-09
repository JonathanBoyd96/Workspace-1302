public class eCredit 
{
	int yahtzees=0;
	int fourOfAKind=0;
	int fullHouse=0;
	public eCredit()
	{
	}
	public int isYahtzees(int[] a, int[] b, int[] c, int[] d, int[] e)
	{
		for (int i =0; i<a.length; i++)
		{
			if(a[i]==b[i]&&b[i]==c[i]&&c[i]==d[i]&&d[i]==e[i])
			{
				yahtzees++;
			}
		}
		return yahtzees;
		
	}
	public int isFourOfAKind(int[] dice1, int[] dice2, int[] dice3, int[] dice4, int[] dice5)
	{
		for (int i =0; i<dice1.length; i++)
		{
			if(dice1[i]==dice2[i]&&dice2[i]==dice3[i]&&dice3[i]==dice4[i] && dice4!=dice1)
			{
				fourOfAKind++;
			}
			else if (dice1[i]==dice3[i]&&dice3[i]==dice4[i]&&dice4[i]==dice5[i] && dice2!=dice1)
			{
				fourOfAKind++;
			}
			else if (dice1[i]==dice2[i]&&dice2[i]==dice4[i]&&dice4[i]==dice5[i] && dice3!=dice1)
			{
				fourOfAKind++;
			}
			else if (dice1[i]==dice2[i]&&dice2[i]==dice3[i]&&dice3[i]==dice5[i] && dice4!=dice1)
			{
				fourOfAKind++;
			}
			else if (dice5[i]==dice1[i]&&dice1[i]==dice2[i]&&dice2[i]==dice3[i] && dice4!=dice1)
			{
				fourOfAKind++;
			}
		}
		return fourOfAKind;
		
	}
	public int isFullHouse(int[] dice1, int[] dice2, int[] dice3, int[] dice4, int[] dice5)
	{
		for (int i =0; i<dice1.length; i++)
		{
			if(dice1[i]==dice2[i]&&dice2[i]==dice3[i]&& dice3[i]==dice4[i] && dice5[i]!=dice1[i])
			{
				fullHouse++;
			}
			if(dice1[i]==dice3[i]&&dice3[i]==dice4[i]&& dice4[i]==dice5[i] && dice2[i]!=dice1[i])
			{
				fullHouse++;
			}
			if(dice1[i]==dice2[i]&&dice2[i]==dice4[i]&& dice4[i]==dice5[i] && dice3[i]!=dice1[i])
			{
				fullHouse++;
			}
			if(dice1[i]==dice2[i]&&dice2[i]==dice3[i]&& dice3[i]==dice5[i] && dice4[i]!=dice1[i])
			{
				fullHouse++;
			}
			if(dice2[i]==dice3[i]&&dice3[i]==dice4[i]&& dice4[i]==dice5[i] && dice5[i]!=dice1[i])
			{
				fullHouse++;
			}
		}
		return fullHouse;
	}
	

}

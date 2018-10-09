
public class recur 
{
	public static void main (String[] argd)
	{
		System.out.println ("5 times 10 equals " + multiply(5,10));
	}
	
	public static int multiply(int x, int y)
	{
		int product = 0;
		if (y==1) // Base Case
		{
			return x;
		}
		else if (y>0) // Recursive Case
		{
			product = x + multiply(x, (y-1));
		}
		
		return product;
	}
}

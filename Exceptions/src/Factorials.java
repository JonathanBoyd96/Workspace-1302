// Jonathan Boyd
// Factorials.java
// March 10th 2015


import java.util.Scanner;
public class Factorials
{
	public static void main(String[] args) throws myException
	{
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		myException over = new myException("Number Over 16");
		while (keepGoing.equals("y") || keepGoing.equals("Y"))
		{
			try
			{
				System.out.print("Enter an integer: ");
				int val = scan.nextInt();
				System.out.println("Factorial(" + val + ") = "
						+ MathUtils.factorial(val));
			}
			catch (myException problem)
			{
				System.out.println(problem);
			}
			finally
			{
				System.out.print("Another factorial? (y/n) ");
				keepGoing = scan.next();
			}
			
		}
	}
}
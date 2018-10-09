// Jonathan Boyd
// CSCI 1302 Mullins
// Lab 6

import java.util.Scanner;

public class Recursion
{
	public static void main (String[] argd)
	{
		Scanner scan = new Scanner(System.in);
		int input = 0;
		String keepGoing = "y";
		
		while(keepGoing == "y")
		{
			
			try
			{
				System.out.println ("Enter a positive integer: ");
				input = scan.nextInt();
				if(input>16)
				{
					System.out.println ("Any number above 17 is too large, please try again.");
					System.out.println ("Enter a positive integer: ");
					input = scan.nextInt();
				}
				fact(input);
				sum(input);
				fib(input);
				
				keepGoing = "n";
			}
			
			
			catch(StackOverflowError neg)
			{
				System.out.println ("You entered an invalid number, please try again.");
				//input = scan.nextInt();
			}
			
			catch(java.util.InputMismatchException let)
			{
				
				System.out.println ("You have not entered a number, please try again.");
				//scan.nextLine();
				//input = scan.nextInt();
			}
		}
			
		
		
		
		
		System.out.println ("You entered " + input);
		
		System.out.println ("The factorial of " + input + " is " + fact(input));
		System.out.println ("The summation of " + input + " is " + sum(input));
		System.out.println ("The 5th Fibonacci number of " + input + " is " + fib(input));
		
	}
	
	public static int sum(int input)
	{
		int s = 0;
		
		if (input==1) 
		{
			return 1;
		}
		
		else 
		{
			s = input + sum(input-1);
		}
		
		return s;
	}
	
	public static int fact(int input)
	{
		int fa = 0;
		
		if (input==1) 
		{
			return 1;
		}
		
		else 
		{
			fa = input * fact(input - 1);
		}
		
		return fa;
	}
	
	public static int fib(int input)
	{
		{
		    if(input == 0)
		        return 0;
		    else if(input == 1)
		      return 1;
		   else
		      return fib(input - 1) + fib(input - 2);
		}
	}
	
}
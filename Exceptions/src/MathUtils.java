// Jonathan Boyd
// MathUtils.java
// March 10th 2015

public class MathUtils
{
	static myException over = new myException("Number Over 16");
	static myException problem = new myException("Negative Number");
	//-------------------------------------------------------------
	// Returns the factorial of the argument given
	//-------------------------------------------------------------
	public static int factorial(int n) throws myException
	{
		int fac = 1;
		for (int i=n; i>0; i--)
			fac *= i;
		
		if (n<0)
			throw problem;
		
		if (n>16)
			throw over;
		
		return fac;
	}
}

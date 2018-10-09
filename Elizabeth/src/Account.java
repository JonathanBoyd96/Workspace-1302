// *******************************************************
// Account.java
// Elizabeth Forney
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
// *******************************************************
public class Account
{
	private double balance;
	private String name;
	private long acctNum;
// ---------------------------------------------
//Constructor -- initializes balance, owner, and account number
// --------------------------------------------
	public Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
// METHODS	
	
// --------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
// --------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
				balance -= amount; // balance = balance - amount
		else 
		System.out.println("Insufficient funds");
		boolean isValid = validateAmount(amount);
		if (!isValid)
	      {
	         System.out.println("Please enter a positive number");
	      }
	}
// --------------------------------------------
// Adds deposit amount to balance. 
// --------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;// balance = balance + amount;
		boolean isValid = validateAmount(amount);
		if (!isValid)
	      {
	         System.out.println("Please enter a positve number");
	      }
	}
// --------------------------------------------
// Returns balance.
// --------------------------------------------
	public double getBalance()
	{
		return balance;
	}
// --------------------------------------------
// Returns a string containing the name, account number, and balance.
// --------------------------------------------
	public String toString()
	{
		return 
				"Name: " + name +
				"\nAccount Number: " + acctNum +
				"\nBalance: " + balance;
	}
// --------------------------------------------
// Deducts $10 service fee //
// --------------------------------------------
	public void chargeFee()
	{
		balance -= 10; // balance = balance - 10
	}
// --------------------------------------------
// Changes the name on the account
// --------------------------------------------
	public void changeName(String newName)
	{
		name = newName;
	}
	
	public Boolean validateAmount(double amount)
	{
		 if(amount < 0 )
		 {
			return false; 
		 }
		 else
		 {
			 return true;
		 }
	}
}
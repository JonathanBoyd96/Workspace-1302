// ****************************************************************
//   accountMenu.java
//	 Elizabeth Forney
//   Use Account class to create and manage bank accounts       
// ****************************************************************

import java.util.Scanner;

public class accountMenu
{
    public static void main(String[] args)
    {
	// declare variables
    	Account acct;
    	int acctNum, balance, menuSelect=0;
    	int depositammt, withdrawalammt;
    	String name, newname;
//prompt user for beginning information for the account: name, 
//number, and beginning balance
    	Scanner scan = new Scanner(System.in);
    	System.out.println ("Please enter the name for the account: ");
    	name = scan.nextLine();
    	System.out.println("Enter the number for the account: ");
    	acctNum = scan.nextInt();
    	System.out.println("Enter the beginning balance: ");
    	balance = scan.nextInt();
    	
    	
// create an instance of the account using the beginning information
    	acct = new Account(balance, name, acctNum);
    	
	// create the following menu
    	do
    	{
    	System.out.println();
    	System.out.println("------------------------------------------------");
    	System.out.println("Welcome to CSCI Bank");
    	System.out.println();
    	System.out.println("Choose one of the following options");
    	System.out.println("by entering the number in front of the option:");
    	System.out.println();
    	System.out.println("1) Check account balance");
    	System.out.println("2) Deposit to account");
    	System.out.println("3) Withdraw from account");
    	System.out.println("4) Print account information");
    	System.out.println("5) Change account name");
    	System.out.println("6) Finished");
    	System.out.println();
    	System.out.println("------------------------------------------------");
    	System.out.println();
    	
    	menuSelect = scan.nextInt();
    	
    	switch(menuSelect)
    	{
    		case 1: System.out.println("Your current balance is " + acct.getBalance());
    			break;
    		case 2: System.out.println("Please enter the deposit amount: ");
    					depositammt = scan.nextInt();
    					acct.deposit(depositammt);
    			break;
    		case 3: System.out.println("Please enter the withdrawal amount: ");
    					withdrawalammt = scan.nextInt();
    					acct.withdraw(withdrawalammt);
    			break;
    		case 4: System.out.println(acct.toString());
    			break;
    		case 5: System.out.println("Please enter the new name you want to put on the account: ");
    					newname = scan.nextLine();
    					acct.changeName(newname);
    			break;
    		case 6: System.out.println("Quitting...");
    			break;
    			default: System.out.println("Invalid selection. Please try again.");
    	}
    	}
    	while(menuSelect !=6);
    	
	// final output thanking user by name for using CSCI Bank
    	System.out.println("Thank you " + name + " for using CSCI Bank!");
}	
}

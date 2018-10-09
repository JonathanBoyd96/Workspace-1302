// Miles Johnson
// Ethan Hills
// Conner Calhoun
// Jonathan Boyd
// Clinton Willis
import java.text.DecimalFormat;
import java.util.*;

public class Pocket2 
{
	private final double valPenny = .01;
	private final double valNickel = .05;
	private final double valDime = .1;
	private final double valQuarter = .25;
	
	private int numPenny;
	private int numNickel;
	private int numDime;
	private int numQuarter;
	
	// Creates a pocket and initializes the number of preset coins
	public Pocket2(int Pennies, int Nickels, int Dimes, int Quarters)
	{
		numPenny = Pennies;
		numNickel = Nickels;
		numDime = Dimes;
		numQuarter = Quarters;
	}
	
	// Creates a pocket with zero of each coin
	public Pocket2()
	{
		numPenny = 0;
		numNickel = 0;
		numDime = 0;
		numQuarter = 0;
	}
	
	// Prints the results
	public String toString()
	{
		DecimalFormat formatter = new DecimalFormat ("0.00");
		
		String P = "Number of Pennies:\t\t"+numPenny+"\nTotal value of all Pennies:\t$"+formatter.format(this.getTotalPennyValue());
		String N = "\nNumber of Nickels:\t\t"+numNickel+"\nTotal value of all Nickels:\t$"+formatter.format(this.getTotalNickelValue());
		String D = "\nNumber of Dimes:\t\t"+numDime+"\nTotal value of all Dimes:\t$"+formatter.format(this.getTotalDimeValue());
		String Q = "\nNumber of Quarters:\t\t"+numQuarter+"\nTotal value of all Quarters:\t$"+formatter.format(this.getTotalQuarterValue());
		String T = "\n\nTotal value of all coins:\t$"+formatter.format(this.getTotalValue());
		
		return P+N+D+Q+T;
		
	}
	
	//Adds Pennies to the pocket
	public void addPennies(double numAdded)
	{
		numPenny+=numAdded;
	}
	
	//Removes Pennies from the pocket
	public void removePennies(double numRemoved)
	{
		if(numPenny>=numRemoved)
			numPenny-=numRemoved;
		else
			System.out.println("You cannot remove that many, that is more than you currently have.");
	}
	
	//Adds Nickels to the pocket
	public void addNickels(double numAdded)
	{
		numNickel+=numAdded;
	}
	
	//Removes Nickels from the Pocket
	public void removeNickels (double numRemoved)
	{
		if(numNickel>=numRemoved)
			numNickel-=numRemoved;
		else
			System.out.println("You cannot remove that many, that is more than you currently have.");
	}
	
	//Adds Dimes to the pocket
	public void addDimes (double numAdded)
	{
		numDime+=numAdded;
	}
	
	//Removes Dimes from the pocket
	public void removeDimes (double numRemoved)
	{
		if(numDime>=numRemoved)
			numDime-=numRemoved;
		else
			System.out.println("You cannot remove that many, that is more than you currently have.");
	}
	
	//Adds Quarters to the pocket
	public void addQuarters (double numAdded)
	{
		numQuarter+=numAdded;
	}
	
	//Removes Quarters from the pocket
	public void removeQuarters (double numRemoved)
	{
		if(numQuarter>=numRemoved)
			numQuarter-=numRemoved;
		else
			System.out.println("You cannot remove that many, that is more than you currently have.");
	}
	
	//Returns value of all pennies
	public double getTotalPennyValue()
	{
		return (valPenny*numPenny);
	}
	
	//Returns value of all Nickels
	public double getTotalNickelValue()
	{
		return (valNickel*numNickel);
	}
	
	//Returns value of all Dimes
	public double getTotalDimeValue()
	{
		return (valDime*numDime);
	}
	
	//Returns value of all Quarters
	public double getTotalQuarterValue()
	{
		return (valQuarter*numQuarter);
	}
	
	//Gets total value of the pocket
	public double getTotalValue()
	{
		return ((numPenny * valPenny)+(numNickel * valNickel)+(numDime * valDime)+(numQuarter*valQuarter));
	}
	
	//Returns number of pennies
	public double getNumberPennies()
	{
		return numPenny;
	}
	
	//Returns number of nickels
	public double getNumberNickels()
	{
		return numNickel;
	}
	
	//Returns number of Dimes
	public double getNumberDimes()
	{
		return numDime;
	}
	
	//Returns number of Quarters
	public double getNumberQuarters()
	{
		return numQuarter;
	}
	
	
}

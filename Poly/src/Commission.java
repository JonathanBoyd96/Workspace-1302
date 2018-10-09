
public class Commission extends Hourly
	{
		double totalSales = 0;
		double commissionRate = 0;
 
		public Commission(String eName, String eAddress, String ePhone,
         String socSecNumber, double rate, double comRate)
		{
			super(eName, eAddress, ePhone, socSecNumber, rate);
			comRate = commissionRate;

		}

 
		public void addSales(double totSales)
		{
			totalSales += totSales;
		}


		public double pay()
		{
			double payment = super.pay() + (commissionRate*totalSales);

			commissionRate = 0;

			return payment;
		}


		public String toString()
		{
			String result = super.toString();

			result += "\nTotal Sales: " + totalSales;

			return result;
		}
}

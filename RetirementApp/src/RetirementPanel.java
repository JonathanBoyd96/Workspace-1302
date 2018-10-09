import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class RetirementPanel extends JPanel 
{
	private JTextField txtStarting;
	private JTextField txtMonthly;
	private JTextField txtYears;
	private JTextField txtRate;
	private JTextArea txtOutput;
	public RetirementPanel() {
		setLayout(null);
		
		JLabel lblRetirementCalculator = new JLabel("Jonathan's Retirement Calculator");
		lblRetirementCalculator.setBounds(106, 5, 238, 17);
		lblRetirementCalculator.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		add(lblRetirementCalculator);
		
		JLabel lblInitialInvestment = new JLabel("Starting Investment ($):");
		lblInitialInvestment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInitialInvestment.setBounds(88, 40, 151, 16);
		add(lblInitialInvestment);
		
		txtStarting = new JTextField();
		txtStarting.setBounds(251, 34, 134, 28);
		add(txtStarting);
		txtStarting.setColumns(10);
		
		txtMonthly = new JTextField();
		txtMonthly.setColumns(10);
		txtMonthly.setBounds(251, 68, 134, 28);
		add(txtMonthly);
		
		JLabel lblMonthlyInvestment = new JLabel("Monthly Investment ($):");
		lblMonthlyInvestment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMonthlyInvestment.setBounds(88, 74, 151, 16);
		add(lblMonthlyInvestment);
		
		txtYears = new JTextField();
		txtYears.setColumns(10);
		txtYears.setBounds(251, 102, 134, 28);
		add(txtYears);
		
		JLabel lblNumberOfYears = new JLabel("Number of Years to Invest:");
		lblNumberOfYears.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumberOfYears.setBounds(46, 108, 193, 16);
		add(lblNumberOfYears);
		
		txtRate = new JTextField();
		txtRate.setColumns(10);
		txtRate.setBounds(251, 136, 134, 28);
		add(txtRate);
		
		final JTextArea txtOutput = new JTextArea();
		txtOutput.setBounds(6, 214, 438, 80);
		add(txtOutput);
		
		JLabel lblAnnualRateOf = new JLabel("Annual Rate of Return(%):");
		lblAnnualRateOf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAnnualRateOf.setBounds(56, 142, 183, 16);
		add(lblAnnualRateOf);
		
		JButton btnCalculateYourRetirement = new JButton("Calculate your retirement total");
		btnCalculateYourRetirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double starting = Double.parseDouble( txtStarting.getText() );
				double monthly = Double.parseDouble( txtMonthly.getText() );
				double years = Double.parseDouble( txtYears.getText() );
				double rate = Double.parseDouble( txtRate.getText() );
				
				double total = starting;
				
				for (int i=0; i<years; i++)
					total = total * (1+ rate / 100) + 12 * monthly;
				txtOutput.setText("With a starting investment of $" + starting + " and investing $" + 
					monthly + " per month for \n" + years + " years at " + rate + 
					"% annually, you could retire with a total of " + "$" + total);
			}
		});
		btnCalculateYourRetirement.setBounds(103, 176, 244, 29);
		add(btnCalculateYourRetirement);
		
		
	}
}

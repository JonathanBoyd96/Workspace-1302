import javax.swing.JFrame;

public class Simon 
{
	public static void main (String[] args)
	{
    JFrame frame = new JFrame ("Simon");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new SimonPanel ());
    frame.pack();
    frame.setVisible(true);
	}
}
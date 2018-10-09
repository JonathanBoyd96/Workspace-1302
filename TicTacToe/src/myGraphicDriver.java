import javax.swing.*;

public class myGraphicDriver 
{
	public static void main(String[] atrgs)
	{
		JFrame myFrame = new JFrame("My Graphic Test Frame");
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    myFrame.getContentPane().add(new myGraphicPanel());
	    
	    myFrame.pack();
	    myFrame.setVisible(true);
	    
	}
	
	
	
	
}

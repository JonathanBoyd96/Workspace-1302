import java.awt.*;
import javax.swing.JPanel;

public class myGraphicPanel extends JPanel
{
	public myGraphicPanel()
	{
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(600,600));
		
	}
	
	public void paint(Graphics page)
	{
		page.setColor(Color.WHITE);
		super.paintComponent(page);
		
		drawBox(page);
		drawOval(page);
	}

	public void drawBox(Graphics page)
	{
		
		page.fillRect(0, 0, 200, 200);
		page.fillRect(400, 400, 200, 200);
		page.fillRect(0, 400, 200, 200);
		page.fillRect(400, 0, 200, 200);
		page.fillRect(200, 200, 200, 200);
		
	}
	
	public void drawOval(Graphics page)
	{
		page.setColor(Color.BLUE);
		page.fillOval(400, 0, 200, 200);
		page.setColor(Color.BLUE);
		page.fillOval(200, 200, 200, 200);
		page.setColor(Color.BLUE);
		page.fillOval(400, 400, 200, 200);
	}
	
	
}

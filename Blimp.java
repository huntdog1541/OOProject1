import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class Blimp {

	Ellipse2D blimp;
	
	public Blimp()
	{
		
	}
	
	public void draw(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		System.out.println(" Draw car ");
		Ellipse2D.Double blimp1 = new Ellipse2D.Double(50, 50, 100, 60);
		
		g2.setColor(Color.blue);
		g2.draw(blimp1);
		g2.fill(blimp1);
		
		g2.setColor(Color.yellow);
		g2.drawString("GOODYEAR", 65, 85);
		
	}
}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class Blimp {

	Ellipse2D blimp;
	private int blimpX;
	private int blimpY;
	private int WordsX;
	private int WordsY;
	
	public Blimp()
	{
		blimpX = 50;
		blimpY = 50;
		WordsX = 65;
		WordsY = 85;
	}
	
	public void draw(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double blimp1 = new Ellipse2D.Double(blimpX, blimpY, 100, 60);
		
		g2.setColor(Color.blue);
		g2.draw(blimp1);
		g2.fill(blimp1);
		
		g2.setColor(Color.yellow);
		g2.drawString("GOODYEAR", WordsX, WordsY);
		
	}
	
	public void blimpMove()
	{
		blimpX = blimpX + 2;
		WordsX = WordsX + 2;
	}
}

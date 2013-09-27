import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;


@SuppressWarnings("unused")
public class Track {

	private static final long serialVersionUID = 7443883203941320122L;

	Rectangle startLine;
	Rectangle finishLine;
	
	public Track()
	{
		
		startLine = new Rectangle(100, 150, 50, 500);
		finishLine = new Rectangle(700, 150, 50, 500);
	}
	
	public void draw(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		
		g2.draw(startLine);
		g2.draw(finishLine);
		g2.drawString("Finish", 705, 400);
		g2.drawString("Start", 120, 450);
	}

}

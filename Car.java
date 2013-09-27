import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.lang.Math;
import java.util.Random;


@SuppressWarnings("unused")
public class Car 
{
	private int x;
	private int y;
	private Color carColor;
	private int numberOfRaces;
	private int numberOfWins;
	private double percentOfWins;
	Random randomGenerator = new Random();
	
	public Car()
	{
		//System.out.println(" Car() ");
		x = 100;
		y = 100;
		
	}
	
	public Car(int VarX, int VarY, Color cc)
	{
		//System.out.println(" Car(int, int, Color) ");
		x = VarX;
		y = VarY;
		carColor = cc;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Color getCarColor() {
		return carColor;
	}

	public void setCarColor(Color carColor) {
		this.carColor = carColor;
	}

	public void moveCar()
	{
		int nX = 0;
		nX = (randomGenerator.nextInt(10) + 1);
		x = x + nX;
		//System.out.println("The random number is ");
		//System.out.println(nX);
		//System.out.println("\n");
	}
	
	public void draw(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
	
		Rectangle body = new Rectangle(x, y + 10, 60, 10);
		g2.setColor(carColor);
		g2.fillRect(x, y + 10, 60, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x + 40, y + 20, 10, 10);
		
		g2.drawArc(x + 15, y, 30, 20, 0, 180);
		
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
	}
}

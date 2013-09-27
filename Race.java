import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Race extends JComponent 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3508613701380649471L;



	private static final Car NULL = null;
	
	private Car car1;
	private Car car2;
	private Car car3;
	private Car car4;
	
	public Race()
	{
		car1 = new Car(100, 200, Color.red);
	}
	
	public Race(int x)
	{
		if(x > 1)
			if(x > 2)
				if(x > 3)
				{
					if(x == 4)
					{
						car4 = new Car(100, 500, Color.cyan);
					}
				}
				else
					car3 = new Car(100, 400, Color.blue);
			else
				car2 = new Car(100, 300, Color.green);		
		else
			car1 = new Car(100, 200, Color.red);
	}
	
	public void paintComponent(Graphics g)
	{	
		if(car1 != NULL)
		car1.draw(g);
		if(car2 != NULL)
		car2.draw(g);
		if(car3 != NULL)
		car3.draw(g);
		if(car4 != NULL)
		car4.draw(g);
	}

	public void moveCars(int x)
	{
		System.out.println("\nmoveCars\n");
		if(x == 1)
		{
			car1.moveCar();
		}
		repaint();
	}
	
}

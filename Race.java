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
	
	private Car cars[] = new Car[4];
	private int arraySize;
	private int endLineX = 500;
	
	public Race()
	{
		cars[0] = new Car(100, 200, Color.red);
	}
	
	public Race(int x)
	{
		arraySize = x + 1;
		if(x > 4)
		{
			System.out.println("There was an error");
		}
		if(x < 1)
			if(x < 2)
				if(x < 3)
				{
					if(x < 4)
					{
						cars[3] = new Car(100, 500, Color.cyan);
					}
				}
				else
					cars[2] = new Car(100, 400, Color.blue);
			else
				cars[1] = new Car(100, 300, Color.green);		
		else
			cars[0] = new Car(100, 200, Color.red);
	}
	
	public void paintComponent(Graphics g)
	{	
		int i = 0;
		while(i < arraySize)
		{
			cars[i].draw(g);
		}
	}

	public void moveCars()
	{
		System.out.println("\nmoveCars\n");
		int i = 0;
		while(i < arraySize)
		{
			cars[i].moveCar();
		}
		
		repaint();
	}
	
	public void printX(int x)
	{
		System.out.println("\nThe X is at ");
		System.out.println(cars[x].getX());
	}
	
	public int finished()
	{
		int i = 0, j = 1;
	
		while(j < 5)
		{
			i = checkEnd(cars[j]);
			j++;
		}
		return i;
	}
	
	private int checkEnd(Car c)
	{
		int x = 0;
		if(c != NULL)
		{
			x = c.getX();
			if(x >= endLineX)
			{
				return 1;
			}
			else
				return 0;
		}
		else
		{
			return 3;
		}
	}
}

import javax.swing.JFrame;


public class Run {

	public static void main(String[] args) {
		System.out.println("Hello World");
		JFrame frame = new JFrame();
		frame.setSize(900, 700);
		frame.setTitle("RACE");
		int x =0;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Race r1 = new Race();
		frame.add(r1);
		
		frame.setVisible(true);
		
		while( x != 10)
		{
		r1.moveCars(1);
		x++;
		}
		
	}

}

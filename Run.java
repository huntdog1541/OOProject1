import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Run {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Better b = new Better();
		JFrame frame = new JFrame();
		frame.setSize(900, 700);
		frame.setTitle("RACE");
		int x =0;
		int numCars = 4;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Race r1 = new Race(numCars);
		frame.add(r1);
		
		frame.setVisible(true);
		
		JPanel message = new JPanel();
        message.add(new JLabel("Label:"));              
        message.add(new JTextField("ABCD"));
        message.setBackground(Color.gray);
        JOptionPane.showConfirmDialog(frame, message, "Default made dialog", JOptionPane.YES_NO_OPTION);
		
		JDialog dialog = new JDialog(frame, "Custom made dialog");
		dialog.setModal(true);
        dialog.setContentPane(message);
        dialog.pack();
        dialog.setLocationRelativeTo(frame);
        dialog.setVisible(true);
        
		b.placeBet(r1, x);
		
		
		
		//r1.printX(1);
		
	}

}

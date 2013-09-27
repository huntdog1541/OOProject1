import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


@SuppressWarnings("unused")
public class Better
{
	//private Race r1;
	private double bank;
	
	private double bet;
	private int numCars;
	private int choiceCar;	
	
	
	public Better()
	{
		//r1 = new Race();
		bank = new Double(500.00);
		bet = new Double(5.00);
		numCars = new Integer(1);
		choiceCar = new Integer(1);
		
		//box = new JComboBox(ch);
			
	}
	
	public void startRace(Race r1)
	{
		int x = 0;
		while( x != 110)
		{
		r1.moveCars();
		x++;
		
		try {
		    Thread.sleep(100);
		} catch (InterruptedException e)
		{
		    e.printStackTrace();
		    // handle the exception...        
		    // For example consider calling Thread.currentThread().interrupt(); here.
		}
		}//close while Loop
		r1.Ending();
		this.endResults(r1);
	}
	
	public void placeBet(Race r1) throws IOException
	{
		String temp1 = getInput("Place amount of bet(if no bet is placed a defualt of $5 is placed):");
		Double t1 = Double.parseDouble(temp1);
		bet = t1;
		
		String temp2 = getInput("How many cars do you want to race?");
		Integer t2 = Integer.parseInt(temp2);
		numCars = t2;
		
		String temp3 = getInput("Choice the number of car that you want to bet on: ");
		Integer t3 = Integer.parseInt(temp3);
		choiceCar = t3;
		
		this.countDown3(r1);
	}
	
	public double getBank() {
		return bank;
	}

	public void setBank(double bank) {
		this.bank = bank;
	}

	public double getBet() {
		return bet;
	}

	public void setBet(double bet) {
		this.bet = bet;
	}

	public int getNumCars() {
		return numCars;
	}

	public void setNumCars(int numCars) {
		this.numCars = numCars;
	}
	
	private void countDown1(Race r1)
	{
		JOptionPane.showMessageDialog(r1, "1"
                ,"CountDown", JOptionPane.PLAIN_MESSAGE);
		this.startRace(r1);
	}
	
	private void countDown2(Race r1)
	{
		JOptionPane.showMessageDialog(r1, "2"
                ,"CountDown", JOptionPane.PLAIN_MESSAGE);
		this.countDown1(r1);
	}
	
	private void countDown3(Race r1)
	{
		JOptionPane.showMessageDialog(r1, "3"
                ,"CountDown", JOptionPane.PLAIN_MESSAGE);
		this.countDown2(r1);
	}

	private void endResults(Race r1)
	{
		JOptionPane.showMessageDialog(r1, ("Car #" + r1.getCarWon() + " Won!")
                ,"End Results", JOptionPane.PLAIN_MESSAGE);
		
		if(choiceCar == r1.getCarWon())
		{
			bank = bank + bet;
		}
		else
		{
			bank = bank - bet;
		}
		
		JOptionPane.showMessageDialog(r1, ("You have $" + bank + " in your bank account")
                ,"Bank", JOptionPane.PLAIN_MESSAGE);
	}
	
	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}

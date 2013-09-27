import javax.swing.JOptionPane;


public class Better
{
	//private Race r1;
	private double bank;
	
	private double bet;
	private int numCars;
	
	
	public Better()
	{
		//r1 = new Race();
		bank = 500.00;
		bet = 5.00;
		numCars = 1;
		
	}
	
	public void startRace(Race r1, int x)
	{
		while( x != 100)
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
		
	}
	
	public void placeBet(Race r1, int x)
	{
		JOptionPane.showMessageDialog(r1, "Place Your Bet Here"
                ,"Bets", JOptionPane.PLAIN_MESSAGE);
		this.startRace(r1, x);
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

}

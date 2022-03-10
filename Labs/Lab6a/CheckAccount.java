public class CheckAccount extends Account
{
	private int numberOfChecks = 0;
	
	public double CheckingAccount(double balance)
	{
		super(balance);
		numberOfChecks++;
		return balance;
	}
	
	public void writeCheck(double balance)
	{
		withdraw(balance);
	}
	
	public String toString()
	{
		String s = "Writing a check!" + "\n" + "total checks written: " + numberOfChecks + "\n" + "balance:$ " + getBalance();
		return s;
	}
}

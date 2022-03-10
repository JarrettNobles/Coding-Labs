import java.util.*;
public static CheckingAccount extends Account
{
	//integer checksWrote
	private int checksWrote=0;
	
	//instance variable of the class
	//stores the number of checks written against the account	
	public CheckingAccount(double d)
	{
		super(d);
		this.checksWrote++;
	}
	
	//WriteCheck method that writes a check for a given amount
	public void writeCheck(double balance)
	{
		withdraw(d);		
	}

	//returns the number of checks written so far
	public String  getChecksWritten()
	{
		String s = "Writing a check!" + "\n" + "total checks= " + checksWrote + "balance= $ " + getBalance();
		return s;
	}



}

import java.util.*;
public class TestClock
{
	public static void main(String[] args)
	{
		Clock dvr =  new Clock();
		//asks for user input
		int hr,min,sec;
		Scanner in =  new Scanner(System.in);
		System.out.println("What time would you like to set your DVR to?");
		System.out.println("");		
		

		//takes user input and stores them into the hours, minutes, and seconds
		System.out.print("\nHours= ");
		 hr= in.nextInt();
		System.out.print("Minutes= ");
		min=in.nextInt();
		System.out.print("Seconds= ");
		sec= in.nextInt();
		System.out.println("");
		
		dvr.reset(hr,min,sec);	
		//DVR is the object of the clock class
		//Clock dvr= new Clock(hr,min,sec);
		//dvr.toString();
		System.out.println("The time is now   "+ dvr.toString());
		
		//calls advance() to advance the time forward
		System.out.println("Advancing the time: ");
		dvr.advance();
		System.out.println("The time is now  "+ dvr.toString());
		

	}	


}

public class Clock
{	
	//store hours 0-23
	private int hr;
	
	//store minutes 0-59
	private int min;
	
	//store seconds 0-59
	private int sec;

	//constructor with parameters to set the time
	public Clock(int hr, int min, int sec)
	{
		setTime(hr,min,sec);
	}
	
	//default constructor
	public Clock()
	{
		setTime(0,0,0);
	}

	//reset method
	public void reset()
	{
		reset(0,0,0);
	}

	//reset method
	public void reset(int hr, int min, int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}

	//method to set time
	public void setTime(int hours, int minutes, int seconds)
	{
		if(0<= hours && hours<24)
			hr = hours;
		else
			min=0;
		if(0<= seconds&& seconds<60)
			min = minutes;
		else
			min=0;
		if(0<= seconds && seconds<60)
			sec = seconds;
		else
			sec=0;

			
	}
	
	//method that advances the time
	public void advance()
	{
		sec++;
		if(sec>59)
		{
			min++;
			sec=0;
		}
		if(min>59)
		{
			hr++;
			min=0;
		}
		if(hr>23)
		{
			hr=0;
		}
		
	}
	
	//The "to String" method that returns hours, minutes, and seconds in string form
	public String toString()
	{
		String time ="";
		if(hr<10)
		{
			time+='0';
			time+= hr + ":";
		}
		if(min<10)
		{
			time+='0';
			time+= min+":";
		}
		if(sec<10)
		{
			time+='0';
			time+=sec;
		}
		return time;
		
	}
	
	//return hours
	public final int returnHours()
	{
		return hr;
	}
	
	//return minutes
	public final int returnMinutes()
	{
		return min;
	}

	//return seconds
	public final int returnSeconds()
	{
		return sec;
	}








}

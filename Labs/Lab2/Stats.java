import java.util.*;
public class Stats
{
	private static final int MAX_SIZE = 100;
	public static void main(String[] args)
	{
        	int[] List = new int[MAX_SIZE];		
		int numItems;

        	numItems = fillUp (List);

        	System.out.println("\n\10\7" + " The range of your " +
                                   numItems + " items is :  " + 
				   Range (List, numItems));

        	System.out.println("\n\10\7" + " The mean of your " + 
                                   numItems + " items is  :  " +
				   Mean (List, numItems));
	}
		
	//Fill up method
	 public static int fillUp(int[] List ) 
	{
		//Int "n" declaration and Scanner)
		int numItems =0;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers for the array list, press 0 to finish the entry");			

		//while n is greater than 0 while loop
		while(true)
		{
			List[numItems] = input.nextInt();
			if (List[numItems]==0)
				break;
			numItems++;
		}
		return numItems;

	}

	//Max method finds the highest value that has been inputted into the array.
	public static int Max(int [] List)
	{
		int maxValue = List[0];
		for(int n=1; n<List.length;n++)
		{
			maxValue = List[n];
		}			
		return maxValue;	
	} 
	
	//Min method finds the lowest value that has been inputted into the array.
	public static int Min( int[] List)
	{
		int minValue = List[0];
		for(int n=1; n>List.length; n++)
		{
			minValue = List[n];
		}
		return minValue;
	}

	//Range Method
	public static int Range (int[] List, int numItems)
	{
		int Max = List[0];
		int Min = List[0];
		
		for(int n=0; n<numItems; n++)
		{
			if(List[n]<Min)
			{
				Min=List[n];
			}	
			if(List[n]>Max)
			{
				Max=List[n];
			}
			
		}
		return Max-Min;
	}
	
	//Mean method
	public static double Mean(int[] List, int numItems)
	{
		double average=0.0;
		for(int n=0; n<numItems;n++)
		{
			average+=List[n];
		}
		average/=numItems;
		return average;
	}
	
}

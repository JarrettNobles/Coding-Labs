public class mySums
{

	public static void main(String[] args)
	{
		System.out.println(iterativeSum(4));
		System.out.println(recurSum(4));	
	}

	public static double iterativeSum(int n)
	{
		double sum = 0;

		for (int i = 1; i <= n; i++)
		{
			sum += (Math.pow(2,i) + 1);
		}
		
		return sum;
	}

	//recurSum method
	public static double recurSum(int n)
	{
		double sum2 = 0;
		
		if(n == 1)
		{
			return sum2 += (Math.pow(2, 1) + 1);
		}
		
		else
		{
			return (recurSum(n - 1) + (Math.pow(2 , n) + 1));
		}
	}	

}

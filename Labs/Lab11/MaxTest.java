
import java.io.*;
@SuppressWarnings("unchecked")

public class MaxTest 
{
   public static void main(String[] args) throws IOException, CloneNotSupportedException
   {
        	Stack stack1 = new Stack();
		stack1.push("Andy");
		stack1.push("Allison");
		stack1.push("Aaron");
		stack1.push("Austin");
		stack1.push("Abbey");
		stack1.push("Alex");
        	System.out.println("findMax(stack1)="+findMax(stack1)); 
        //	System.out.println("stack1.findMax()="+stack1.findMax()); 
  }
  
  public static String findMax(Stack stack1) throws CloneNotSupportedException
  {
	String currMax = "AAA";
	Stack temp = (Stack)stack1.clone();
	while( ! temp.isEmpty())
	{
		String  currItem = (String) temp.top();
		if(currItem.compareTo(currMax) > 0)
		{
			currMax = (String) currItem;
			
			
		}
		temp.pop();
	}

	return currMax;
  }

  



	
}

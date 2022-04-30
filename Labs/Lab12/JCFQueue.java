
import java.util.*;

@SuppressWarnings("unchecked")
public class JCFQueue
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		LinkedList queue1 = new LinkedList();
		LinkedList queue2 = new LinkedList();
		Object key = new Character('$');

        	queue1.addLast(new Character('b'));
        	queue1.addLast(new Character('$'));
        	queue1.addLast(new Character('E'));
        	queue1.addLast(new Character('$'));
        	queue2.addLast(new Character('b'));
        	queue2.addLast(new Character('$'));
        	queue2.addLast(new Character('E'));
        	queue2.addLast(new Character('b'));
		System.out.println("dup check = " +
                    identicalCheck(queue1, queue2));
		findAndReplace(queue1, key, new Character('*'));
		System.out.println("** After findAndReplace **");
		printQueue(queue1);
	}

	private static boolean identicalCheck(LinkedList queue1,
                                              LinkedList queue2)
                throws CloneNotSupportedException
	{
		int size1 = queue1.size();
		int size2 = queue2.size();
		if(size1 != size2)  
		return false;
		int index = 0;
		while(index < size1) 
		{
			if(! queue1.get(index).equals(queue2.get(index))) 
			{
				
				return false;
			}  
			
			index++;
		}
		
		return true;
		



	}


	private static void findAndReplace(LinkedList queue1, 
		Object key, Object newVal)
	{
		int size = queue1.size();
		int index = 0;
		while(index < size) 
		{
			if(queue1.get(index).equals(key))
			{
				queue1.set(index, new Character((Character) newVal)); 
			}
			index++;
		}


	}



	private static void printQueue (LinkedList queue1)
		 throws CloneNotSupportedException
	{

		int size = queue1.size();
		int index = 0;
		while(index < size)
		{
			System.out.println(queue1.get(index));
			index++;
		}


	}


}

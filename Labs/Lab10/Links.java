
@SuppressWarnings("unchecked")

public class Links
{
	public static void main(String[] args)
	{
          	Node pos1 = null;
    		Node pos2 = null;
    		pos1 = new Node(new Integer(13));
   		pos1.setNext(new Node(new Integer(15), null));
    		pos2 = new Node(new Integer(11), null);
		pos2.setNext(pos1);
		printList(pos2);
		System.out.println("The number of nodes are" + count(pos2));
		System.out.println("The maximum value of nodes are" + findMax(pos2));
	
	}

	private static void printList(Node head)
	{
		if (head != null)
		{
			System.out.println(head.getItem());
			printList(head.getNext());
		}
	}


	private static int count(Node head)
	{
		if (head == null)
			return 0;
		else
			return 1 + count(head.getNext());

	}

	private static int findMax(Node head)
	{
		int maxVal = head.getItem();
		while (head != null)
		{
			if (head.getItem().compareTo(maxVal) == 1)
			{
				maxVal = head.getItem();
			}
			
			head = head.getNext();
		}
		
		return maxVal;



	}
}

import java.io.*;
import java.util.*;
public class MinString
{
        private static final int SIZE = 10;
        public static void main(String[] args)
        {
                String[] list = new String[SIZE];
                int numItems;

                numItems = Initialize (list);
                System.out.println(FindMin (list, numItems));
        }

        private static int Initialize (String[] list)
        {
          //post : List is initialized with all strings from file.

          String filename, stateInput;
          int i = 0, numItems = 0;
          try  {
                System.out.print("Input File : ");
                Scanner stdin = new Scanner(System.in);
                filename = stdin.nextLine();
                stdin = new Scanner(new File(filename));

                while ((stdin.hasNext()) && (i < list.length))
                {
                        stateInput = stdin.nextLine();
                        System.out.println("S = " + stateInput);
                        list[i] = stateInput;
                        i++;
                }
                numItems = i;
          }
          catch (IOException e)  {
                System.out.println(e.getMessage());
          }
          return numItems;
        }

        // Method FindMin finds the minimum string value
        private static String FindMin(String[] list, int numItems)
	{
		int i;
		String stringMinValue = list[0];
		for(i=0; i<numItems; i++)
		{
			if(stringMinValue.compareTo(list[i]) > 0)
			{
				stringMinValue = list[i];
			}
		}

 		//return the final minimum string value
		return stringMinValue;
	}

}


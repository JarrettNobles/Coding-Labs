import java.util.*;

public class TestArrayList
{
    public static void main(String[] args)
    {
	ArrayList<String> myArrayList = new ArrayList<String>(10);

	myArrayList.add("python");	

	myArrayList.add("java");
	myArrayList.add("java");
	myArrayList.add("java");
	myArrayList.add("java");
	myArrayList.add("java");

	myArrayList.add("C++");
	myArrayList.add("C++");
	myArrayList.add("C++");
	myArrayList.add("C++");

	//printArrayList(myArrayList);
	delete(myArrayList, "java");
	printArrayList(myArrayList);
	System.out.println("C++ count: "+ count(myArrayList, "C++"));
    }

    private static void printArrayList(ArrayList<String> myArrayList)
    {
	// Pre  : myArrayList has been initialized
	// Post : The elements of Vector v are printed to the screen on separate lines
	for(String s : myArrayList)
	{
		System.out.println(s);
		
	}


	

    }

    private static void delete(ArrayList<String> myArrayList, Object key)
    {
	// Pre  : myArrayList has been initialized
	// Post : All copies of key are removed from myArrayList
	ArrayList<String> newList = new ArrayList<>(10);
	for(String s : myArrayList)
	{
		if(!s.equals(key))
		{
			newList.add(s);		
		}
	}
	myArrayList.clear();
	myArrayList.addAll(newList);
    }

    private static int count(ArrayList<String> myArrayList, Object key)
    {
	// Pre  : myArrayList has been initialized
	// Post : number of occurrences of key is computed and returned
	int count=0;
	for(String s : myArrayList)
	{
		if(key.equals(s))
		{
			count=count+1;
		}
	}
	return count;
	
    }
}

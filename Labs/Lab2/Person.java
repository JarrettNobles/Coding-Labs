public class Person
{
  private String name;
  private int    id;
  private static int personCount = 0;

  // constructor
  public Person(String pname)
  {
    name = pname;
    personCount++;
    id = 100 + personCount;
  }
  
  //overloaded constructor
  public Person()
  {
	this.name = name;
	this.id = id;
  }

  //reset method that can be used to reset the two private instance variables
  public void reset(String name, int id)
  {
  	this.id = id;
	this.name = name;	
 
  }
 
   //the To String method
  public String  toString()
  {
    return "name: " + name + "  id: " + id 
      + "  (Person count: " + personCount + ")";
  }

  // static/class method
  public static int getCount()
  {
    return personCount;
  }
  
  //get "Id" method to return the ID
  public int getId()
  {
  	return id;
  }

  //get "name" method to return the name
  public String getName()
  {
  	return name;
  }

}

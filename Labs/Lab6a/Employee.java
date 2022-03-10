public class Employee extends Person 
{
	private double salary;
	private Date employDate;
	
	public Employee(String lastName, String firstName, Date birthDate, Double salary, Date emplDate)
	{
		super(lastName);
		super(firstName);
		super(birthDate);
		this.employDate = employDate;
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getEmployDate()
	{
		return employDate;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void setEmployDate(Date employDate)
	{
		this.employDate = employDate;
	}
	
	
}


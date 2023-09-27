public class Employee2
{
	int id;
	String name;
	String dept;
	
	public Employee2()
	{
		
		this(10);
		
	}
	public Employee2(int id)
	{
		this(id, "Ram");
	}
	
	public Employee2(int id, String name)
	{
		
		this(id, name,"IT");
	}
	
	public Employee2(int id, String name, String dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
}

package oopsConcept;

public class ClassA {
	public int Salary;
    public String Name;
	public String Orgname;
	
	public ClassA()
	{
		System.out.println("Inside constructor");
	}

	public ClassA(int val1,String val2, String val3)
	{
		System.out.println("Inside parameterised constructor");
		
		this.Salary = val1;
		this.Name =val2;
		this.Orgname= val3;
	}
	public void Display()
	{
	System.out.println("Name of employee  "+ Name);
	System.out.println("Salary of employee  "+ Salary);
	System.out.println("Orgname of employee  "+ Orgname);

	}
	

}

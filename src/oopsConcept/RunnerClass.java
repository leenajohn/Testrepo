package oopsConcept;

public class RunnerClass {
	public static void main(String args[])
	{
     ClassA  Emp1 = new ClassA(100,"Leena", "XYZ");
    // ClassA Emp1= new ClassA();
     ClassB obj1 = new ClassB();
     obj1.Name = "Leena1";
     obj1.Salary = 1000;
     obj1.Orgname = "IBM";
     obj1.Display();
     obj1.show();
     
     ClassC obj2 = new ClassC();
     obj2.run();
     
/*	Emp1.Name = "Leena";
	Emp1.Salary=1000;
	Emp1.Orgname = "CISCO";*/
	
	Emp1.Display();
	}

}

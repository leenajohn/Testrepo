package oopsConcept;

public class RunnerClass {
	public static void main(String args[])
	{
  /*   ClassA  Emp1 = new ClassA(100,"Leena", "XYZ");
    // ClassA Emp1= new ClassA();
     ClassB obj1 = new ClassB();
     obj1.Name = "Leena1";
     obj1.Salary = 1000;
     obj1.Orgname = "IBM";
     obj1.Display();
     obj1.show();
     
     ClassC obj2 = new ClassC();
     obj2.run();
     
Emp1.Name = "Leena";
	Emp1.Salary=1000;
	Emp1.Orgname = "CISCO";
	
	Emp1.Display();*/
		
		MethodOverloading obj1 = new MethodOverloading();
		{
			 obj1.add(1,2);
			 obj1.add(1.1,1.3);
			 obj1.mult(1.1,1.2);
		 	
		}
		
	   MethodOverrideChild obj2= new MethodOverrideChild();
	   {
		   obj2.display1();
		   //obj2.display(a+b);
	   }
	
	   AbstractChild Obj5 = new AbstractChild();
	   {
		   Obj5.method2();
		   Obj5.method1();
		   
	   }
	   InterfaceChild Obj6 = new InterfaceChild();
	   Obj6.method1();
	   Obj6.method2();
	   Obj6.mthod3();
	   
	//   EncapsulationExample obj7 =  new EncapsulationExample();
	   EncapsulationExample obj7 = null;
	     obj7.setSalary(1000);
	     
	     System.out.println("Salary = "+obj7.getSalary());
	     

		}
	   
	   
	
	}
  
    


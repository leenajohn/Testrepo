package oopsConcept;

public class MethodOverloading {
	public void add(int a, int b) {
	
	int sum  = a+b;
	
    System.out.println("sum = "+ sum);
}
   public void add(double a , double b)
   {
	   double sum = a +b;
	   System.out.println("Double Output"+sum);
   }
   
   public void mult(double a , double b)
   {
	   double mult = a * b;
	   System.out.println("Double Output"+mult);
   }
}


package Test;

public class ThrowExample {
   public static void main(String args[]) {
	   
	  try {
	   
	   int age = 13;
	   
	   if (age<19)
	  {
		   throw  new ArithmeticException("not a valid age");
		   
	  }
	  else
	  {
		   System.out.println("Eligible age for voting");
	  }
   }catch(ArithmeticException e) {
	   System.out.println("Exception Handled");   
   }
   }
}

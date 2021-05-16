package Test;

public class ThrowsExample {
	
	public static void main(String args[])
	{
		
		ThrowsExample obj = new ThrowsExample();
		try {
		
		obj.eligibility(17);
	}catch(ArithmeticException e)
		{
		System.out.println("Exception Handled");
		}
	}
	
	public  void eligibility(int age) throws ArithmeticException	 {
		
		
		if(age<18)
		{
			throw new ArithmeticException("not a valid age");
		}
		else {
			System.out.println("Eligibility for voting");
		}		
	}
}

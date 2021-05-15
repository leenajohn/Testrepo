package Test;

public class ExceptionHandling {
	public static void main(String args[])
	{
		int a = 10;
		int b = 5;
		
		try 
		{
		 int result =a/b;
		 System.out.println("After error");
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception is handled"+e);
		}
		
		catch(	Exception e)
	    {
		System.out.println("Exception Handled");
     	}finally
      	{

		System.out.println("finally Handled");
		System.out.println("Hello");
	}
    int myarr[] = {1,2,3,4,5,6};
    
    try {
    	System.out.println("Third value in array"+ myarr[7]);
    }catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("Array Index out of bound handled");
    }
}
}
package Test;

public class TypeCasting {
	
	public static void main(String args[])
	{
		char a  = 'A';
		
		System.out.println("A ="+a); 
		
		int b = 'b';
		
		System.out.println("value ="+ b);
		
		
		// this is not possible 
		char c = 98;
		
		System.out.println("value -"+c);
		
		// explicit type caste
		
		
		double  num = 45.5;
		int num1 = (int)num;
		System.out.println("int = "+ num1);
		
	}

}

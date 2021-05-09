package Test;

import java.util.Scanner;

public class MyClass {
	public static void main(String args[])
	{
	System.out.println("First Project");
	
	int num1=10, num2=20, sum ,mult;
	float div;
	sum = num1+num2;
	mult = num1*num2;
	div = (float )num1/num2;
	String name = "Leena";

	
	System.out.println("sum = "+sum);
	System.out.println("mult = "+mult);
	System.out.println("div="+ div);
	System.out.println("name = "+name);
	System.out.println("lenght = "+name.length());
	
	char a = 'a';
	
	/*Scanner scan = new Scanner(System.in);
	System.out.println("Enter name of the user");
	String name1 = scan.next();
	System.out.println("Hello " + name1);
	System.out.println("Length " + name1.length());  */
	
	/*--------------Array----------------------------------------*/
	
	int arr[] = {1,2,3,4,5};
	
	System.out.println("Array = "+ arr[2]);
	//System.out.println("Array = "+ length());
	
	
	
	
	
	}

}

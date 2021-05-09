package Test;

import java.util.Scanner;

public class EvenNoCheck {
	public static void main(String args[])
	{  
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		if(num%2==0)
		{
			System.out.println("num is  even"+ num);
		}			
		 
        else 
        {
            System.out.println("Number is not even"+num);
        }	
		
	}
	

}

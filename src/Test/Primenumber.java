package Test;

import java.util.Scanner;

public class Primenumber {
	public static void main(String args[])
	{

	Scanner input= new Scanner(System.in);
    
    System.out.println("Enter any number");
   
    int number = input.nextInt();
    
    if (number%number==0||number%1==0)
    {
        System.out.println("Number is prime");
        
    }
        else
        {
            System.out.println("Number is not prime");
        }

//public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int temp;
        boolean isPrime=true;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        
        for(int i=2;i<=num/2;i++)
        {
               temp=num%i;
           if(temp==0)
           {
              isPrime=false;
              break;
           }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
           System.out.println("Number is Prime : " + num);
        else
           System.out.println("Number is not Prime : " + num);
       
    }
 }
//}

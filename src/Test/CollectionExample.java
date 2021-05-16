package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {
	
	public static void main(String args[])
	{
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Raj");
		mylist.add("Lynn");
		mylist.add("Diya");
		mylist.add("Aaron");
		mylist.add("Akku");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder());
		
		
		System.out.println(mylist);
		
// using stack
		
		Stack<String>  mystack = new Stack<String> ();
		mystack.push("abc");
		mystack.push("xyz");
		mystack.pop();
		mystack.push("pqr");
		
		System.out.println("mystack ="+ mystack);
		
		  
 		
	}

}

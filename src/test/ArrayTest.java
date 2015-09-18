package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int[] i1 = new int[] { 33, 12, 98 };

		   System.out.println("The array is:");
		   for (int number : i1) {
		   System.out.println("Number = " + number);
		   }
		   HashSet<String> obj1=new HashSet();
			obj1.add("hi");
			HashSet<String> obj2=new HashSet();
			obj2.add("hi");
			obj2.add("heoll");
			
		   System.out.println("The string representation of array is:");
		   System.out.println(i1);  
		   System.out.println(i1.hashCode());  
		   System.out.println(i1.getClass());  
		   System.out.println(obj1.hashCode());  
		   System.out.println(obj2.hashCode());  
		   
		   double number;
		   Scanner scant = new Scanner(System.in);
		   System.out.println("Enter your gross income: ");
		   if (scant.hasNextInt())
		   {
		   number = (double)scant.nextInt();
		   System.out.println("You entered double " + number);
		   }
		   else if (scant.hasNextFloat())
		   {
		   number = (double)scant.nextFloat();
		   System.out.println("You entered float" + number);
		   }
		   else if (scant.hasNextDouble())
		   {
		   number = scant.nextDouble();
		   System.out.println("You entered le" + number);
		   }
		   else {
		   System.out.println("Not a real value or integer value.");
		   }
		   
	}

}

package area;

import java.util.Scanner;

public class Square extends Area{
	Scanner in = new Scanner(System.in);
	
	public void findArea(){
		 System.out.println("Enter Side of Square:");
	      try{ 
	       
	    	  double side = in.nextDouble();
	          double area = side*side; 
              System.out.println("Area of Square is: "+area);
	      }
			catch(Exception e){
			e.printStackTrace();	
			}
	     	}

}

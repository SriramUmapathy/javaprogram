package area;

import java.util.Scanner;

public class Triangle extends Area{

	Scanner in = new Scanner(System.in);
	
	public void findArea(){
		 System.out.println("Enter the width of the Triangle:");
	    try{
	    	double base = in.nextDouble();
	    

	      System.out.println("Enter the height of the Triangle:");
	      double height = in.nextDouble();

	      double area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);    
	}
	catch(Exception e){
	e.printStackTrace();	
	}
	}

}

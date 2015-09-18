package area;

import java.util.Scanner;

public class Rectangle extends Area{
	Scanner in=new Scanner(System.in);
	
	public void findArea(){
		System.out.println("Enter the length of Rectangle:");
		  try{ 
		   double length = in.nextDouble();
		   System.out.println("Enter the width of Rectangle:");
		   double width = in.nextDouble();
		   double area = length*width;
		   System.out.println("Area of Rectangle is:"+area);
		  }
			catch(Exception e){
			e.printStackTrace();	
			}
		  }
	
}

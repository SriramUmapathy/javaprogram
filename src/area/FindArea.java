package area;

import java.util.Scanner;

public class FindArea {
	
   static Scanner in=new Scanner(System.in);
	
   public static void main(String[] args) {
	 try{
		 String yn;
	 
	   do{
		Area squobj=new Square();
		Area recobj=new Rectangle();
		Area triobj=new Triangle();
		System.out.println("Enter the number u wanna find the area");
		System.out.println("1.square");
		System.out.println("2.rectangle");
		System.out.println("3.triangle");
		try
		{
		int choose=in.nextInt();
		switch (choose){
		case 1:
			squobj.findArea();
			break;
		case 2:
			recobj.findArea();
			break;
		case 3:
			triobj.findArea();
			break;
		default:
			System.out.println("wrong input!!");
			break;
			
		}
		}
		
		catch(Exception e){
			e.printStackTrace();	
		}
		
		System.out.println("want to process more (y/n)");
		yn=in.next();
	   }while(yn.equalsIgnoreCase("y"));
	 }
		catch(Exception e){
		e.printStackTrace();	
		}
	
   }

}

package exceptionhandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DifferentException {
	Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("1.Arithmetic Exception");
	System.out.println("2.ClassNotFound Exception");
	System.out.println("3.FileNotFound Exception");
	System.out.println("4.InputMisMatch Exception");
	System.out.println("5.NullPointer Exception");
	System.out.println("6.IO Exception");
	DifferentException obj=new DifferentException();
	obj.go();
	}
	
	public void go(){
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			arithmeticException();
			break;
		case 2:
			System.out.println("Enter the class name you wanna find");
		    String classname=in.next();

			classNotFoundException(classname);
			break;
		case 3:
			fileNotFoundException();
			break;
		case 4:
			inputMisMatchException();
			break;
		case 5:
			nullPointerException();
			break;
		case 6:
			iOException();
			break;

		default:
			System.out.println("wrong input!!");
			break;
		}

	}
	
	public void arithmeticException(){
	try{
		System.out.println("enter the 1st number :");
		int a=in.nextInt();
		System.out.println("enter the 2nd number(dont enter zero) :");
		int b=in.nextInt();
		int divide=a/b;
	}
	catch(ArithmeticException e){
		System.out.println("you cant able to divide a number by zero");
	}
	}
	
	public void classNotFoundException(String classname){
		try{
			
		Class exceptionclass=Class.forName("exceptionhandle."+classname);
		System.out.println("your class name is present");
		}
	catch(ClassNotFoundException e){
		System.out.println("sorry there is no class in name u wanna find");
		System.out.println("if u wanna create a class in that name press(y/n):");
		String yesno=in.next();
		if(yesno.equalsIgnoreCase("y")){
			File file = new File("D:\\WORKSPACES\\LUNA WORKSPACE\\start\\src\\exceptionhandle\\"+classname+".java");
			if (!file.exists()) {
				System.out.println("not exist");

				
					try {
						file.createNewFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				
			}

			System.out.println("you created a new class with the above name "+classname);	
		}
		else{
			System.out.println("Thank you");
		}
	}
		
	}
	
	
	public void iOException(){
		 BufferedReader br = null;

	        String curline;
	        try {
	            br = new BufferedReader(new FileReader("sampl.txt"));
	            while ((curline = br.readLine()) != null) {
	                System.out.println(curline);
	            }
	        }
	        catch (IOException e) {
	            System.err.println("An IOException was caught :"+e.getMessage());
	        }
	        finally{
	            try {
	            	if(br != null)
	                    br.close();
	            	}
	            catch (IOException e) {
	            	e.printStackTrace();
	            }

	        }

	}
	
	
	
	
	
	
	public void fileNotFoundException(){
		System.out.println("Enter the file name you wanna find");
		String filename=in.next();
		FileInputStream fis = null;
	    try
	    {
	      fis = new FileInputStream(filename+".txt");
	    }
	    catch(FileNotFoundException e)
	    {
	      System.out.println("The source file does not exist. " + e);
	    }          
	}
	
	
	
	
	public void nullPointerException(){
		Scanner datain=new Scanner(System.in);
		System.out.println("enter your name");
		String name=datain.nextLine();
		if(name.equals("")){
			name=null;
		}
		try{
			System.out.println("your length of the name is "+name.length());
		}
		catch(NullPointerException e){
			System.out.println("you have entered a null value java throughs nullpointerexception");
		System.out.println("enter your name again");
		nullPointerException();
		}
	}
	
	
	
	
	
	public void inputMisMatchException(){
		System.out.println("Enter your age");
		try{
			int age=in.nextInt();
			
		}
		catch(InputMismatchException e){
			in.next();
			System.out.println("you have thrown a inputmismatch exception age should be in integer");
			System.out.println("please enter again correctly");
			inputMisMatchException();
		}
		}
	
}

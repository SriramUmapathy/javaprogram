package start;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		boolean y=true;
		do{		
	    
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial");
		
		try{
		
			int value=in.nextInt();
	    FactorialUsingRecursion obj=new FactorialUsingRecursion();
		int get=obj.fact(value);
		System.out.println("The value of factorial :"+get);
				}
		catch(Exception e){
		
			e.printStackTrace();
		}
		System.out.println("If u wanna check factorial of another number");
		System.out.println("Enter y/n");
		try{
		String check=in.next();
		char x=check.charAt(0);
		
		if(x =='n'){
		
			y=false;
		}
		}
		catch(Exception e){e.printStackTrace();}
		
		}while(y != false);
		

	}
	
	int fact(int val){
		int rtn;
		if(val>1){
		rtn=fact(val-1)*val;
		
		return rtn;}
		else{
			return 1;
		}
	}

}

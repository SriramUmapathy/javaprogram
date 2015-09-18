package start;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of the pyramid u want");
	try{
		int size=in.nextInt();
	
		int i=0;
		do{
			int j=0;
			int k=0;
					while(j<size-i){ 
		             System.out.print(" ");
		        j++; 
		        }
					
		        while(k<=i){
		            System.out.print("$ ");
		        k++;
		        }
		        System.out.println();  
		    i++;
		}while(i<size);
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}

package start;

import java.util.Scanner;

public class Calculator {
	Scanner in=new Scanner(System.in);
	static int add =0;
	static int sub =0;
	static int mul =1;
	
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.go();
			}

	void go(){
	String check = null;
	do{
	System.out.println("//**Calculator**\\");
	System.out.println("1.add ");
	System.out.println("2.subtract ");
	System.out.println("2.multiply ");
	System.out.println("2.divide ");
	int choice = in.nextInt();
	switch (choice) {
	case 1:
		add();
		break;
	case 2:
		sub();
		break;
	case 3:
		multiply();
		break;

	default:
		System.out.println("wrong input!!");
		break;
	}
	System.out.println("wanna process more press y/n:");
	try{
		check=in.next();
	if(check.equalsIgnoreCase("y")){
		System.out.println("*****welcome again*****");
	}
	else{
		System.out.println("/////Thank you\\\\\\t");
	}
	}
		
	catch(Exception e){
		e.printStackTrace();
		}
		
	}while(check.equalsIgnoreCase("y"));

	}
	
	 void add(){
		System.out.println("How many numbers you want to add");
		int a=in.nextInt();
		add(a);
		
	}
	
	void add(int a){
		
		if(a>=2){
			for(int i=0;i<a;i++){
				System.out.println("enter the number that u wanna add up");
				int b=in.nextInt();
				add=add+b;
				if(i>=1){
					System.out.println("total="+add);				
				}
			}
		}
	}
	void sub(){
		System.out.println("Enter how many number you wanna subtract");
		int a=in.nextInt();
		if(a>=2){
			for(int i=0;i<a;i++){
			System.out.println("enter the number that u wanna Subtract");
			int b=in.nextInt();
			sub=b-sub;
			if(i>=1){
				System.out.println("total="+sub);				
			}
			}
			}
		}
	void multiply(){
		System.out.println("Enter how many num u wanna multiply");
		int a=in.nextInt();
		if(a>=2){
			for(int i=0;i<a;i++){
				System.out.println("enter the number u wanna multiply");
				int b=in.nextInt();
				mul=mul*b;
				if(i>=1){
					System.out.println("total= "+mul);
				}
			}
		}
	}
	}


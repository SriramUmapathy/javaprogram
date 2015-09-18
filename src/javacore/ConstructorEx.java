package javacore;

import java.util.Scanner;

public class ConstructorEx {
	int a=0;
	static int counter=0;
	ConstructorEx(){

		System.out.println("default constructor");
		return ;
	}
	ConstructorEx(int a){
		this();
		a=a;
		counter++;
	}

	public static void main(String[] args) {
		ConstructorEx obj=new ConstructorEx(5);
		System.out.println("1st "+counter);
		ConstructorEx obj1=new ConstructorEx(6);
		System.out.println("2nd "+counter);
		obj1.doubleEquals();
		obj1.equalsMethod();
		ConstructorEx obj3;
	}
	public void doubleEquals(){
		System.out.println("enter 1st number ");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("enter 2st number ");
		int b=in.nextInt();
		if(a==b){
			System.out.println("both are equal");
		}else
		{
			System.out.println("not equal");
		}
	}

	public void equalsMethod(){
		System.out.println("enter 1st number ");
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		System.out.println("enter 2st number ");
		String b=in.nextLine();
		if(a.equals(b)){
			System.out.println("both are equal");
		}else
		{
			System.out.println("not equal");
		}
	}
	
}

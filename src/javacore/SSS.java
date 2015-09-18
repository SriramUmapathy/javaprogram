package javacore;

import java.util.Scanner;

public class SSS {

	public static void main(String[] args) {
		SSS obj=new SSS();
		System.out.println("1.HashCode diff b/w String and StringBuffer");
		System.out.println("1.performance diff b/w String and StringBuffer");
		System.out.println("1.performance diff b/w StringBuilder and StringBuffer");
		obj.go();

	}
	void go(){
		Scanner in=new Scanner(System.in);
		int choice = in.nextInt();
		switch (choice) {
		case 1:

			generateHC();
			break;
		case 2:
			generateTime();
			break;
		case 3:
			diffBWSB();
			break;
		
		default:
			System.out.println("wrong input!!");
			break;
		}
	}
	public void generateHC(){
		 System.out.println("Hashcode test of String:");  
	        String str="sri";  
	        System.out.println(str.hashCode());  
	        str=str+"ram";  
	        System.out.println(str.hashCode());  
	   
	        System.out.println("Hashcode test of StringBuffer:");  
	        StringBuffer sb=new StringBuffer("sri");  
	        System.out.println(sb.hashCode());  
	        sb.append("ram");  
	        System.out.println(sb.hashCode());  
	}

public void generateTime(){
	long startTime = System.currentTimeMillis();  
    concatWithString();  
    System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
    startTime = System.currentTimeMillis();  
    concatWithStringBuffer();  
    System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  

	
}
public  String concatWithString()    {  
    String t = "sri";  
    for (int i=0; i<10000; i++){  
        t = t + "ram";  
    }  
    return t;  
}  
public  String concatWithStringBuffer(){  
    StringBuffer sb = new StringBuffer("sri");  
    for (int i=0; i<10000; i++){  
        sb.append("ram");  
    }  
    return sb.toString();  
}
public void diffBWSB(){
	 long startTime = System.currentTimeMillis();  
     StringBuffer sb = new StringBuffer("sri");  
     for (int i=0; i<10000; i++){  
         sb.append("ram");  
     }  
     System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
     startTime = System.currentTimeMillis();  
     StringBuilder sb2 = new StringBuilder("sri");  
     for (int i=0; i<10000; i++){  
         sb2.append("ram");  
     }  
     System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
}
}

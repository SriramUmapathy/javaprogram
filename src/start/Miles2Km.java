package start;

import java.util.Scanner;

public class Miles2Km {
	static Scanner in=new Scanner(System.in);
	
	public static void main(String[] args){
		//1 mile=1.609344 km
		//1 cm=0.01 meter
		Miles2Km obj=new Miles2Km();
		obj.go();
	}
	public void go(){
		boolean y=true;
		String check = null;
		do{
		System.out.println("enter what u wanna find");
		System.out.println("1.miles to km ");
		System.out.println("2.cm to meter ");
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			milesToKm();
			break;
		case 2:
			cmToMeter();
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
			catch(Exception e){e.printStackTrace();}
			
		}while(check.equalsIgnoreCase("y"));
	}
	public void milesToKm(){
		float[] array=new float[10];
		System.out.println("enter the num of conversion u wanna to make");
		int num=in.nextInt();
		
		for(int i=0;i<num;i++){
			System.out.println("enter the "+i+" to convert it to KM");
			try{			int miles=in.nextInt();
			float km=miles*1.6093f;
			array[i]=km;			
			}
			catch(Exception e){
			e.printStackTrace();	
			}
		}
		
		for(int i=0;i<num;i++){
			System.out.println(""+array[i]);
		}
		
		}
    public void cmToMeter(){
	
    float[] array=new float[10];
	System.out.println("enter the num of conversion u wanna to make");
	int num=in.nextInt();
	
	for(int i=0;i<num;i++){
		System.out.println("enter the "+i+" to convert it to meter");
	try{	
		int cm=in.nextInt();
	float m=cm*0.01f;
		array[i]=m;			
	}catch(Exception e){
	e.printStackTrace();	
	}

	}
	
	for(int i=0;i<num;i++){
		System.out.println(""+array[i]);
	}

}
}
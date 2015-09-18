package start;

public class Constructor {
	public Constructor(){
		
	}
	public Constructor(int a){
		System.out.println("single parameter constructor");
	}
	public Constructor(int a,int b){
		System.out.println("multi parameter constructor");
	}
	public Constructor(String a){
		System.out.println("single parameter constructor with string");
	}
	public Constructor(int a,String b){
		System.out.println("multi different parameter constructor");
	}
	
	
	
	public static void main(String[] args) {
		Constructor obj;
		obj=new Constructor();
		obj=new Constructor(5);
		obj=new Constructor(5,"i am just passing a String");
		obj=new Constructor("single parameter with string");
		
		
		
		
	}

}

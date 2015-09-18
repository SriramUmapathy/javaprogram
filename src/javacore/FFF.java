package javacore;

final class FFF {
protected void finalize(){
	System.out.println("inside the finalize method");
}
	public static void main(String[] args) {
		final String a="this value cant be changed anymore";
		FFF obj1=new FFF();
		FFF obj2=new FFF();
		FFF obj3=new FFF();
		obj1=null;
		System.gc();
		try{
		obj1.check();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("this is inside the finally method it will execute whether the exception handled or not");
		}
	}
public void check(){
	System.out.println("done");
} 
}

package javacore;

public class BreakCont {

	public static void main(String[] args) {
		
        System.out.println("Break\n----------------");

        for(int i=1;i<=5;i++)
        {
            if(i==4) break;
            System.out.println(i);
        }


        
        System.out.println("Continue\n-------------");

        for(int i=1;i<=5;i++)
        {
            if(i==4) continue;
            System.out.println(i);
        }
	}

}

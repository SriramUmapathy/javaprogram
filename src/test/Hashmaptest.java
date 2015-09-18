package test;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmaptest {

	public static void main(String[] args) throws IOException {
		
		Map<String, ArrayList> map = new HashMap<String, ArrayList>();

        ArrayList<String> valSetOne = new ArrayList<String>();
        valSetOne.add("Apple");
        valSetOne.add("zeroplane");
        valSetOne.add("dgf");

        ArrayList<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("Bat");
        valSetTwo.add("Banana");

        ArrayList<String> valSetThree = new ArrayList<String>();
        valSetThree.add("Cat");
        valSetThree.add("Car");

        map.put("A", valSetOne);
        map.put("B", valSetTwo);
        map.put("C", valSetThree);
        FileWriter fstream= new FileWriter("sample.txt",true);  
		BufferedWriter out= new BufferedWriter(fstream);  
		
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        
        for (Map.Entry<String, ArrayList> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList<String> values = entry.getValue();
            System.out.println("Key = " + key);
            out.write("\n"+key+"\n");
            
            int i=0;
            Iterator itr=values.iterator();//getting Iterator from arraylist to traverse elements  
            while(itr.hasNext()){ 
            	System.out.println(i++);
            	String samp1=(String)itr.next();
                out.write(samp1+"\t");
             
             System.out.println("file written");
            } 
            System.out.println("Values = " + values+ "n");
        }
    
		
		
		//out.write(name);
		/*array=obj.get(name);
		 String arrayname[]=(String[]) array.toArray();
		out.write(arrayname[0]);
		out.write(arrayname[1]);
		out.write(arrayname[2]);
		*/
		out.close();
		 
		
	}

}

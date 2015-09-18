package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadInFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\sriram\\sriram.txt");
		
		try{
			FileReader fr = new FileReader(file); 
		
		BufferedReader br = new BufferedReader(fr); 
		String s; 
		while((s = br.readLine()) != null) { 
		System.out.println(s); 
		} 
		fr.close(); 
	
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}

package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class FileCreation {

	public static void main(String[] args) {
		try {

			String content = "This is the content to write into file";

			File file = new File("sample.txt");

			if (!file.exists()) {
				System.out.println("not exist");

				file.createNewFile();
			}
			HashMap<String,Object> fileObj = new HashMap<String,Object>();

			ArrayList<String> cols = new ArrayList<String>();  
			cols.add("a");  
			cols.add("b");  
			cols.add("c");  
			fileObj.put("mylist",cols);  
			FileOutputStream f = new FileOutputStream(file);  
			ObjectOutputStream s = new ObjectOutputStream(f);          
			s.writeObject(fileObj);
			s.flush();

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			//bw.write(fileObj.get("mylist"));
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			}

}

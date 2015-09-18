package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		String name="Dhanalakshmi College of Engineering";
		File file = new File("C:\\sriram\\sriram.txt");
		if (!file.exists()) {
			System.out.println("not exist");

			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try{
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(name);
			bw.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("File created and written successfully");

	}

}

package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("sample1.txt");
		if (!file.exists()) {
			System.out.println("not exist");

			file.createNewFile();
		}
		System.out.println("File created");

	}

}

package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFileInC {

	public static void main(String[] args) {
		File file = new File("C:\\sriram\\sriram.txt");
		if (!file.exists()) {
			System.out.println("not exist");

			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("File created");

	}

}

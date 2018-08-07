package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		
		String data = "Hello";
		
		System.out.println(System.getProperty("file.separator "));

		// TODO Auto-generated method stub
		File file = new File("Cookies2.data");
		if(file.exists()){
			file.delete();
		}
		file.createNewFile();
		BufferedWriter bw = null;
		FileWriter fw = null;
		System.out.println(file.getAbsoluteFile());
		fw = new FileWriter(file.getAbsoluteFile(), true);
		
		bw = new BufferedWriter(fw);
		
		bw.write(data);
		
		bw.close();

		fw.close();
	}

}

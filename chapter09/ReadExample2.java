package chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\temp\\test.txt");
		
		int readData;
		
		String data = "";
		while (true) {
			readData = reader.read();

			if (readData == -1) {
				break;
			}		
			 
			System.out.print((char)readData);

		}
		
		reader.close();

	}

}

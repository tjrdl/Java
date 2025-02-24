package Java.chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\temp\\test.txt");
		
		int readData;
		char[] cbuf = new char[2];
		String data="";
		
		while (true) {
			readData = reader.read(cbuf);
			if (readData == -1) {
				break;
			}		
			 data += new String(cbuf,0,readData);

		}
		System.out.print(data);
		
		reader.close();

	}

}

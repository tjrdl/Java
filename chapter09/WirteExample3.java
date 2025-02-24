package Java.chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;

public class WirteExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\temp\\output1.txt");
		
		// 문자열을 문자 하나씩 배열로 가져온다.
		char[] data = "홍길동".toCharArray();
		
		for (int i = 0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.close();
	}

}

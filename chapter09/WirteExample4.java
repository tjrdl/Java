package Java.chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;

public class WirteExample4 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\temp\\output2.txt");
		
		// 문자열을 문자 하나씩 배열로 가져온다.
		char[] data = "홍길동".toCharArray();
		writer.write(data);
		writer.close();
	}

}

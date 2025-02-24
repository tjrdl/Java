package Java.chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;

public class WirteExample5 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\temp\\output3.txt");
		
		// 문자열을 문자 하나씩 배열로 가져온다.
		char[] data = "홍길동".toCharArray();
		writer.write(data,1,2);
		writer.close();
	}

}

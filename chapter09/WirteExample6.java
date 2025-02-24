package Java.chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Writer;

public class WirteExample6 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\temp\\output6.txt");
		
		// 문자열을 문자 하나씩 배열로 가져온다.
//		char[] data = "홍길동".toCharArray();
		String data = "안녕 자바 프로그램";
		writer.write(data,3,2); // index 3번에서 2만큼 읽어 파일로 저장 index[3] = 자, 2만큼 => 자바
		writer.close();
	}

}

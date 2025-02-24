package chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream os = new FileOutputStream("C:\\temp\\test.txt");
		
		// 바이트 단위로 문자열을 읽는다.
		byte [] data = "ABC".getBytes();
		
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.close();
	}

}

package chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WirteExample2 {

	public static void main(String[] args) throws Exception {
		FileOutputStream os = new FileOutputStream("C:\\temp\\test4.txt");
		
		byte [] data = "DEF".getBytes();
		
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
		os.write(data,1,2); // index 1~2까지의 내용을 저장 (EF 저장)
		
		os.flush(); // 인터넷이 불안정한 상태에서 네트워크 연결이 끊겼을 때 전송되지 못한 데이터를 보냄.
		
		
		os.close();
	}

}

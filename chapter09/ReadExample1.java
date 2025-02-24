package chapter09;

// ctrl shift o => import 정리
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	// throws Exception : 파일이 없을 경우 예외 발생
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\temp\\test.txt");
		int readByte;
		byte[] readBytes = new byte[3];
		String data = "";
		int count = 0;
		while (true) {
//			readByte = is.read();
			readByte = is.read(readBytes); //3byte 단위로 읽는다. 
			// 파일의 끝에는 -1이 존재 (EOF)
			if (readByte == -1) {
				break;
			}
			// readBytes를 인덱스 0부터 readByte 길이만큼 읽음
			
			data += new String(readBytes, 0, readByte);
			System.out.println(count);
			count++;
		}
		System.out.println(data);

//		while ((readByte = is.read())!= -1) {
//
//			System.out.print((char)readByte);
//		}
	}

}

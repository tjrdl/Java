package Java.chapter07;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {

		File dir = new File("c:\\aaa\\bbb"); // 하위 디렉토리 포함
		File file1 = new File("c:\\aaa\\file1.txt"); // 파일
		File file2 = new File("c:\\aaa\\file2.txt"); // 파일
		File file3 = new File("c:\\aaa\\file3.txt"); // 파일

		// dir.mkdir(); // 디렉토리 만들기
		dir.mkdirs(); // 하위 디렉토리까지 같이 만들기
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();

		File test = new File("c:\\aaa");
		// 디렉토리 정보를 가지고 test 객체 생성
		File[] contents = test.listFiles();
		System.out.println("년   월   일   시간         형태            크기        이름");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		

		for (int i = 0; i < contents.length; i++) {
//			System.out.print(new Date(contents[i].lastModified()) ); // 마지막 생성일자
			System.out.print(sdf.format(new Date(contents[i].lastModified()))); // 마지막 생성일자
			if (contents[i].isDirectory()) {
				System.out.println("\t<DIR>\t\t"+contents[i].getName());

			} else {
				System.out.println("\t\t\t"+contents[i].length()+"\t" + contents[i].getName());
			}
		}

	}

}

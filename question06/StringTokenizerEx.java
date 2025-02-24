package Java.question06;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
//		String str = "홍길동/장화/홍련/콩쥐/팥쥐";
//		StringTokenizer st = new StringTokenizer(str,"/");
//		int count = st.countTokens();
//		for (int i = 0; i < count; i++) {
//			System.out.println(st.nextToken());
//		}
		
		String str [] = {"홍길동/장화/홍련/콩쥐/팥쥐"};
		
		for (String string : str) {
			StringTokenizer st = new StringTokenizer(string,"/");
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
		}
		
	}

}

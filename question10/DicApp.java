package Java.question10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		Map<String, String> Dict = new HashMap<>();
		Dict.put("사랑", "love");
		Dict.put("아기", "baby");
		Dict.put("돈", "money");
		Dict.put("미래", "future");
		Dict.put("희망", "hope");
		String str ="";
		
		
		while(true) {

			System.out.println("한글 단어?");
			str = sc.nextLine();
			
			if(str.equals("그만")) {
				break;
			}
			
			if(Dict.containsKey(str)) {
				System.out.println(Dict.get(str));
			}
		}		
		sc.close();
	}

}

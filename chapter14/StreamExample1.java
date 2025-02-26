package Java.chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Java", "Stream", "library");
		System.out.println("입력 데이터 = " + words);
		 List<Integer> result = words.stream() // 스트림 생성
		// .filter(n-> {return n%2==0;}) // filter 메소드로 짝수만 추출
		 .map(String::length) // map 메소드로 제곱
		 .collect(Collectors.toList()); // 스트림 객체를 리스트로 변환
		 System.out.println("result=" +result);
	}

}

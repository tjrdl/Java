package Java.chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println("입력 데이터 = "+numbers);
		List<Integer> result = numbers.stream() // 스트림 생성 
		.filter(n-> {return n%2==0;}) // filter 메소드로 짝수만 추출
		.map(n->{return n*n;}) // map 메소드로 제곱
		.collect(Collectors.toList()); // 스트림 객체를 리스트로 변환
		System.out.println("result=" +result);
	}

}

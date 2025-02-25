package Java.chapter13;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Function 인터페이스로 람다식 객체 구현
		Function<Integer, Integer> f1 = i->i*4;
		System.out.println(f1.apply(3));
		
		// String 매개변수 타입, Integer 리턴 타입
		Function<String, Integer> f2 = s->s.length();
		System.out.println(f2.apply("hello"));
	}

}

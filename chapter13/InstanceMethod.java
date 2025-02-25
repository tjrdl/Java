package Java.chapter13;

import java.util.function.Supplier;

public class InstanceMethod {

	// Supplier 인터페이스는 매개변수가 없고 반환값만 존재한다.
	static void print(Supplier<Integer> f) {
		System.out.println(f.get());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello wrold";
		System.out.println(s.length());
		
		//람다식 표현
		print(()->s.length());
		
		// 메소드 참조
		print(s::length);
	}

}

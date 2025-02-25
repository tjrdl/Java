package Java.chapter13;

import java.util.function.BiFunction;

class Calc {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매개변수 2개를 받고 1개를 반환
//		BiFunction<Integer, Integer, Integer> bi = (x1, x2) -> x1 + x2;
		
		// 메소드 참조
		BiFunction<Integer, Integer, Integer> bi = Calc::add;
		int result = bi.apply(10,20);
		System.out.println("주어진 수의 덧셈: "+result);
	}

}

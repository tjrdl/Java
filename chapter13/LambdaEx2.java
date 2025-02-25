package Java.chapter13;


interface MyFunction2 {
	int calc(int x); // 람다식으로 구현할 추상 메소드
}

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction2 square = x -> x*x;

		System.out.println(square.calc(2));
	}

}

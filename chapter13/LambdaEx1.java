package Java.chapter13;


interface MyFunction {
	int calc(int x, int y); // 람다식으로 구현할 추상 메소드
}

public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction add = (x,y) -> {return x+y;};
//		MyFunction sub = (x,y) -> {return x-y;};
		MyFunction sub = (x,y) -> x-y;; // 람다식 {}와 return 생략 가능
		System.out.println(add.calc(1,2));
		System.out.println(sub.calc(1,2));
	}

}

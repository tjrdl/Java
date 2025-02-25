package Java.chapter13;

@FunctionalInterface // 추상메소드 1개만 쓰도록 체크
interface MyFunction5<T> {
	void print(T x);
//	void print2(); 두번째 추상 메소드 선언으로 인한 오류
}

public class LambdaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction5<String> f1 = (x)->System.out.println(x);
		f1.print("ABC");
		MyFunction5<Integer> f2 = (x)->System.out.println(x);
		f2.print(Integer.valueOf(100));
	}
	

}

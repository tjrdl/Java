package Java.chapter4;

// default
class Calc {
	// non static(instance)멤버는 객체를 생성해야 사용 가능 ex) Calc.abs(int) 사용 불가
//	public int abs(int a) {

	public static int abs(int a) {
		return a > 0 ? a : -a;
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	public static int min(int a, int b) {
		return a < b ? a : b;
	}
}

// 접근 지정자
public class CalcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Calc.abs(5));
		System.out.println(Calc.max(5, 10));
		System.out.println(Calc.min(5, 10));
	}

}

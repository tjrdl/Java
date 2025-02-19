package Java.package1;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a; // 래퍼런스 변수 선언
		// A 클래스 파일에서 public이 아닌 private class A 로 선언된 경우 오류
		// class A 선언시 default 접근 지정자로 같은 패키지 내에서 사용 가능
		A a1 = new A(true);
		A a2 = new A(1);
//		A a3 = new A("String"); // private로 선언되어 접근 불가
	}

}

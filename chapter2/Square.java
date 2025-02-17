package chapter2;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
//		int s = square(); // 메소드 호출부
		int s = square(n);
		System.out.println(s);
	}
	// square : 메소드명
	// int : 리턴타입
	// int length : int 타입의 매개변수(인자, 파라미터, 입력변수)
	// void : 리턴타입이 없음
	// 리턴문이 없거나 void가 아닌경우 오류
	public static int square(int length) { // 메소드 정의부
		// 리턴 타입이 int인 상태에서 string을 리턴해서 오류 return "1";
		return length;
	}

}

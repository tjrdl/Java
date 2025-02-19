package Java.chapter4_real;

// 동일한 패키지 내에 중복된 클래스 선언시 오류
//class Circle {}

class Circle3 {
	int radius;

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public Circle3(int radius) {
		this.radius = radius;
	}
}

class Circle4 {
}

class Circle5 {
}

class Circle6 {
}

// public 클래스가 2개 이상인 경우 오류
// public class Circle7{}

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3[] c; // 객체배열 Circle3을 참조변수 c로 선언
		c = new Circle3[5]; // 객체배열 생성

		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle3(i); // 객체 생성
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getArea());
		}
	}

}

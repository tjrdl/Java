package Java.chapter4_real;

public class Circle {
	// 멤버변수(필드)
	int radius;
	String name;
	
	//오버로딩
	
	// 클래스의 이름과 똑같은 메소드: 생성자(기본)
	public Circle() {
		
	}
	
	// 클래스의 이름과 똑같은 메소드: 생성자(매개변수 1개)
	public Circle(int a) {
		
	}
	
	// 클래스의 이름과 똑같은 메소드: 생성자(매개변수 2개)
	public Circle(int a, int b) {
		
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 참조변수 선언
		Circle pizza;
		pizza = new Circle(); // 객체 생성, 이름이 pizza
		pizza.radius = 10;
		double result = pizza.getArea();
		System.out.println(result);
		
		Circle donut = new Circle();
		donut.radius=2;
		String name = donut.name="자바도넛";
		result = donut.getArea();
		System.out.println(name+result);
	}

}

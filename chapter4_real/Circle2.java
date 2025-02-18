package Java.chapter4_real;

public class Circle2 {
	int radius;
	String name;
	public double getArea() {
		return 3.14*radius*radius;
	}
	public Circle2() {
		radius = 1;
		name="";
	}
	public Circle2(int radius, String n) {
		this.radius = radius;
		this.name = n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 pizza = new Circle2(); // radius = 1, name = ""
		double area = pizza.getArea();
		System.out.println(area);
		Circle2 donut = new Circle2(4,"donut"); // radius = 4, name = "donut"
		area = donut.getArea();
		System.out.println(area+donut.name);
		
		// Circle2(int radius, String n)을 가리키지만 radius 값은 변동 없음
		Circle2 donut2 = new Circle2(8,"@@"); // radius = 4, name = ""
//		donut2.name="JavaDonut";
		area = donut2.getArea();
		System.out.println(area+donut2.name);
		
	}

}

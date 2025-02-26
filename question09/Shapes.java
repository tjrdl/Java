package Java.question09;

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("다시그립니다.");
		draw();
	}
	
}
class Circle1 implements Shape {
	public int radius;
	Circle1() {
		this.radius = 0;
	}
	Circle1(int r) {
		radius = r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 "+radius+"인 원 입니다.");
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * PI;
	}
	
}


public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape donut = new Circle1(10);
		donut.redraw();
		System.out.println("면적은"+donut.getArea());
	}

}

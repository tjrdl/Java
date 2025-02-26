package Java.question09;


class Circle {
	private int x;
	private int y;
	private int radius;
	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Circle circle = (Circle) obj;
		return x == circle.x && y == circle.y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle ("+x+","+y+")"+"반지름 "+radius;
	}
}
	

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		
		System.out.println("원 a : " +a);
		System.out.println("원 b : " +b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("서로 다른 원");
		}
	}

}

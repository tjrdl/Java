package Java.chapter5;

class Point2 {
	private int x,y;
	public Point2() {
		this.x = this.y=  0;
		
	}
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint2 extends Point2{ 
	private String color;
	
	public ColorPoint2(int x, int y,String color) {
		super(x,y);
		this.color=color;
	}
	public void showColorPorint() {
		System.out.println(color);
		showPoint();
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint2 cp = new ColorPoint2(5,6,"blue");
		cp.showColorPorint();
	}

}

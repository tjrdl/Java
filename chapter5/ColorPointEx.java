package Java.chapter5;

// super
class Point{
	private int x,y;
	public void setX(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPorint() {
		System.out.println("("+x+","+y+")");
	}
	
	
	
}

// 서브클래스
class ColorPoint extends Point{ 
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPorint() {
		System.out.println(color);
	}
}
public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.setX(1, 2);
		p.showPorint();
		
		// 객체를 생성, 멤버는 7개, 생성자 호출(기본): Point(슈퍼)->ColorPoint(서브)
		ColorPoint p2 = new ColorPoint();
		p2.setX(3,4);
		p2.showPorint();
		p2.setColor("red");
		p2.showColorPorint();
		
	}

}

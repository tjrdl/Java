package Java.question09;

class PointTow {
	String Color;
	public void rename(String Color) {
		this.Color=Color;
	}
	public String getColor() {
		return Color;
	}
}

public class ColorPointTwo extends PointTow {
	String Color;
	int x, y;

	ColorPointTwo() {
		this.Color = "Black";
		this.x = 0;
		this.y = 0;
	}
	ColorPointTwo(int x, int y) {
		this.Color = "Black";
		this.x = x;
		this.y= y;
	}
	private void setXY(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}
	
	public void setColor(String color) {
		rename(color);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Color+"색의 ("+x+","+y+")의 점";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPointTwo cp1 = new ColorPointTwo();
		System.out.println(cp1);
		
		ColorPointTwo cp = new ColorPointTwo(10,10);
		cp.setXY(10, 10);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}

}

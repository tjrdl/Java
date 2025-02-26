package Java.question09;

class PointThree {
	private int x,y;
	public PointThree(int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.x = x2;
		y = y2;
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+","+y+")의 점";
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}

public class Point3D extends PointThree {
	private int z;
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public void moveUp() {
		this.z++;
	}
	public void moveDown() {
		this.z--;
	}
	public void move(int x, int y, int z) {
		move(x,y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+getX()+","+getY()+","+z+")의 점";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString());
		
		p.moveUp();
		System.out.println(p.toString());
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString());
		
		p.move(100, 200, 300);
		System.out.println(p.toString());
	}

}

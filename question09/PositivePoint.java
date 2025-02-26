package Java.question09;

class PointFour {
	private int a, b;
	
	public PointFour() {
		a = 0;
		b = 0;
	}

	public PointFour(int a, int b) {
		if(a > 0 & b > 0) {
			this.a = a;
			this.b = b;
			
		}
	}

	public void move(int a,int b) {
		if(a > 0 & b > 0) {
		this.a = a;
		this.b = b;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + a + "," + b + ")의 점";
	}

}

public class PositivePoint extends PointFour {
	PositivePoint() {
		super();
	}
	PositivePoint(int a, int b) {
			super(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString());
		
		p.move(-5, 5);
		System.out.println(p.toString());
		
		PositivePoint p2 = new PositivePoint(-10, 10);
		System.out.println(p2.toString());
		
		
	}

}

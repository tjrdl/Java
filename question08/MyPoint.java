package Java.question08;

public class MyPoint {
	private int a;
	private int b;
	
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+a+", "+b+")";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if(p.equals(q)) {
			System.out.println("같은 점");
			
		}
		else {
			System.out.println("다른 점");
		}
	}

}

package Java.question09;

class Oval implements Shape {
	int r1, r2;
	public Oval(int i, int j) {
		// TODO Auto-generated constructor stub
		r1 = i;
		r2 = j;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(r1+"x"+r2+"에 내접하는 타원입니다.");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (r1/2) * (r2/2) * PI;
	}
	
	
}
class Rect implements Shape {
	int w, h;
	public Rect(int i, int j) {
		// TODO Auto-generated constructor stub
		w = i;
		h = j;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(w+"x"+h+"크기의 사각형 입니다.");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return w * h;
	}
	
}

public class Shapes2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape []list = new Shape[3];
		list[0] = new Circle1(10);
		list[1] = new Oval(20,30);
		list[2] = new Rect(10,20);
		
		for(int i = 0; i<list.length; i++) {
			list[i].redraw();
		}
		for(int i = 0; i< list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
		
	}

}

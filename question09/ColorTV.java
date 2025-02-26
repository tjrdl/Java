package Java.question09;

class TV {
	private int size;
	public TV(int size ) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}


public class ColorTV extends TV {
	
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.setColor(color);
		// TODO Auto-generated constructor stub
	}
	
	public void printProperty() {
		System.out.println(getSize()+"inch "+getColor()+"color");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}

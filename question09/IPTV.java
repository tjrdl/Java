package Java.question09;

public class IPTV extends ColorTV {
	private String ip;
	public IPTV(String string, int size, int color) {
		super(size,color);
		this.ip = string;
		
		// TODO Auto-generated constructor stub
		
	}
	
	public void printProperty() {
		System.out.print("나의 IPTV는 "+ip+"주소의 ");
		super.printProperty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
	

}

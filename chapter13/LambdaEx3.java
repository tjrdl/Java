package Java.chapter13;


interface MyFunction3 {
	void print();
}

public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction3 f = ()->System.out.println("hello");
		f.print();
		
		f=()->System.out.println("hi");
		f.print();
	}

}

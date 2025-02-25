package Java.chapter13;


interface MyFunction4 {
	int clac(int x, int y);
}

public class LambdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultiply(3,4,(x,y)->x*y);
	}
	static void printMultiply(int x, int y, MyFunction4 f) {
		System.out.println(f.clac(x,y));
	}

}

package Java.chapter4;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
			System.out.println("클래스를 찾음");
			
		} catch (Exception e) {
			System.out.println("클래스를 찾지 못함");
		}
	}
	public static void findClass() {
		try {
			Class.forName("java.lang.String");
			System.out.println("클래스를 찾음 2");
		}
		catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못함 2");
		}
}


}

package Java.chapter07;

public class BoxExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		// upcasting
		Object box2 = new Box();
		
		// upcasting
		box.setObject("홍길동");
		// downcasting
		String name = (String)box.get();
		System.out.println(name);
		
		// upcasting
		box.setObject(777);
		// downcasting
		int number = (int)box.get();
		System.out.println(number);
		
		// upcasting, 애플 객체
		box.setObject(new Apple());
		// dwoncasting
		Apple apple = (Apple)box.get();
		System.out.println(apple);
		
	}

}

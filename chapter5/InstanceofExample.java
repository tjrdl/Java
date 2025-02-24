package Java.chapter5;

public class InstanceofExample {

	public static void method1(Parent parent) {
		// TODO Auto-generated method stub
		if (parent instanceof Child) {
			// downcasting
			Child child = (Child) parent;
			System.out.println("method1 - Child downcasting");
		} else {
			System.out.println("method1 - Child downcasting fail");
		}
	}
	public static void main(String[] args) {
		// upcasting
		Parent parentA = new Child();
		method1(parentA);
		
		
		Parent parentB = new Parent();
		method1(parentB);
	}

}

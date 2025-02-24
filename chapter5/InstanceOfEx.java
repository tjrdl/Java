package Java.chapter5;

class Person {
}

class Student extends Person {
}

class Researcher extends Person {
}

class Professor extends Person {
}

public class InstanceOfEx {
	// new Student()가 Person p 로 업캐스팅
	static void print(Person p) {
		if (p instanceof Person) {
			System.out.println("Y-Person");
		}
		if (p instanceof Student) {
			System.out.println("Y-Stu");
		}
		if (p instanceof Researcher) {
			System.out.println("Y-Res");
		}
		if (p instanceof Professor) {
			System.out.println("Y-Pro");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		print(p);
		System.out.println("========");
		print(new Student());
		System.out.println("========");
		print(new Researcher());
		System.out.println("========");
		print(new Professor());
		System.out.println("========");
		print(new Person());
		System.out.println("========");
		
	}

}

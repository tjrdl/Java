package Java.question08;

import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lname;
		String fname;
		String fullname;
		Person person1 = new Person();
		Person person2 = new Person();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성을 입력하세요");
		fname = sc.nextLine();
		System.out.println("이름을 입력하세요");
		lname = sc.nextLine();
		person1.setFirstName(fname);
		person1.setLastName(lname);
		fullname = person1.getFirstName()+person1.getLastName();
		System.out.println(fullname+" "+fullname.length());
		
		System.out.println("성을 입력하세요");
		fname = sc.nextLine();
		System.out.println("이름을 입력하세요");
		lname = sc.nextLine();
		person2.setFirstName(fname);
		person2.setLastName(lname);
		fullname = person2.getFirstName()+person2.getLastName();
		System.out.println(fullname+" "+fullname.length());

	}

}

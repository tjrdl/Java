package Java.question08;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setName("갑돌");
		student1.setNumber(100);
		student1.setDepartment("컴공");
		System.out.println(student1.toString());
		
		student2.setName("갑순");
		student2.setNumber(200);
		student2.setDepartment("건축");
		
		System.out.println(student2.toString());
		student2.setDepartment("수학과");
		System.out.println(student2.toString());
	}

}

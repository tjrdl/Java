package Java.question08;

public class Student {
	private String Name;
	private int Number;
	private String Department;
	
	public String getName() {
		return Name;
	}
	public int getNumber() {
		return Number;
	}
	public String getDepartment() {
		return Department;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public void setDepartment(String department) {
		Department = department;
	}
//	public String toString() {
//		System.out.println("이름: "+Name);
//		System.out.println("학번: "+Number);
//		System.out.println("소속학과: "+Department);
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: " + this.Name + "\n" + "학번: "+this.Number + "\n" + "소속학과: " +this.Department;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

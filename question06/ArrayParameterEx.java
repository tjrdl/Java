package Java.question06;

public class ArrayParameterEx {
	private String str [] = {null};
	
	public void PrintStringArray() {
		for (int i = 0; i<str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
	}
	
	public void setStr(String[] str) {
		this.str = str;
	}
	
	public void replaceBe() {
		for (int i = 0; i<str.length; i++) {
			str[i] = str[i].replaceAll("be","eat");
		}
	}
	
	public void printStringArray() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"to be or not to be"};
		ArrayParameterEx arr = new ArrayParameterEx();
		arr.setStr(array);
		arr.PrintStringArray();
		arr.replaceBe();
		arr.PrintStringArray();
	}

}

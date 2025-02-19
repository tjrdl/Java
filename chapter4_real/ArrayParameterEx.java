package Java.chapter4_real;

public class ArrayParameterEx {
	static void replaceSpace(char a[]) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}}
		}
		static void printCharArray(char a[]) {
			for(int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
				}
			System.out.println();
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c [] = {'T','H','I','S',' ','i','s'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
	
}

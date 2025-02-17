package question03;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다.");
		
		boolean a = false;
		do {
			System.out.print(">>");
			str = sc.next();
			if(str.equals("exit")) {
				a = true;
			}
			
				
		} while(a==false);
		
		System.out.print("종료합니다.");
		
	}

}

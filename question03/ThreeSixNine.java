package question03;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("10~99 사이의 정수를 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		int a = 0, b = 0;
		
		a = num / 10;
		b = num % 10;
		
		if(a==3 || a == 6 || a == 9) {
			count++;
		}
		if(b == 3 || b == 6 || b == 9) {
			count++;
		}
		if(count == 1) {
			System.out.println("박수짝");
		}
		else if(count == 2) {	
			System.out.println("박수짝짝");
		}
		
		
		
		
		
	}

}

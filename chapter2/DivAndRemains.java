package chapter2;

import java.util.Scanner;

public class DivAndRemains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)>> ");
		int num1 = sc.nextInt();
		
		if (10 <= num1 && num1 <= 99) {
			int num2 = num1 % 10;
			int num3 = num1 / 10;
			if (num2 == num3) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else {
				System.out.println("10의 자리와 1의 자리가 다릅니다.");
			}
		}
		sc.close();
		
	
	}

}

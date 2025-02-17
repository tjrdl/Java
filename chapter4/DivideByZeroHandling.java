package chapter4;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("분자 입력>>");
		dividend = sc.nextInt();
		System.out.print("분모 입력>>");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
			
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없음. 다시 입력하세요.");
		}
		
		sc.close();
	}

}

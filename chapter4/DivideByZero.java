package chapter4;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("분자 입력>>");
		dividend = sc.nextInt();
		System.out.print("분모 입력>>");
		divisor = sc.nextInt();
		
		System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		sc.close();
	}

}

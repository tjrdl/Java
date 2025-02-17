package chapter2;

import java.util.Scanner;

public class ExSumMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("3자리수 정수 입력(100~999)>> ");
		int num1 = sc.nextInt();
		
		if (100 <= num1 && num1 <= 999) {
			int num2 = num1 % 10; // 1의 자리
			int num3 = num1 / 100; // 100의 자리
			int num4 = num1 / 10 % 10; // 10의 자리
			System.out.println("100의 자리와 10의 자리의 합은"+(num3+num4));
			System.out.println("10의 자리와 1의 자리의 곱은"+(num4*num2));
		}
		sc.close();
	}

}

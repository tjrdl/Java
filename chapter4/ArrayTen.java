package Java.chapter4;

import java.util.Scanner;

public class ArrayTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력하세요");
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			int num1 = sc.nextInt();
			sum += num1;
		}
		System.out.println("합계는 "+sum);
	}

}

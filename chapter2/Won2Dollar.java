package chapter2;

import java.util.Scanner;

public class Won2Dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>> ");
		int a = sc.nextInt();
		float b = a / 1100;
		System.out.println(a + "원은 $" + b + "입니다.");
		sc.close();

	}

}

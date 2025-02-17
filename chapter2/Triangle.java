package chapter2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 + num2 > num3 && (num1 + num3 > num2) && (num2 + num3 > num1) ){
			System.out.println("삼각형이 됩니다.");
		}
		else {
			System.out.println("삼각형이 안됩니다.");

		}
		sc.close();
	}

}

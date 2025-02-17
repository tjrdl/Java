package chapter2;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("수를 입력: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if ( number  % 3 == 0) {
			System.out.print("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아님");
		}
		sc.close();
	}

}

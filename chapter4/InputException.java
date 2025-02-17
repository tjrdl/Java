package chapter4;

import java.util.Iterator;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, n = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력: ");

		for (int i = 0; i < 3; i++) {
			System.out.print(">>");
			try {
				n = sc.nextInt();
				
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				break;
			}
			sum += n ;
		}
		System.out.println("sum = "+sum);
		
		sc.close();
	}

}

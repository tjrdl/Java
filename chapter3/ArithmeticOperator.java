package chapter3;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int num = sc.nextInt();
		
		int hour = 0, minute = 0, sec = 0;
		
		hour = num / 3600 ;
		minute = num / 60 - hour * 60;
		sec = num % 60;
		System.out.print(hour+" "+minute+" "+sec);
	}

}

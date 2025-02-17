package chapter2;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 != 0 && num2 != 0 && num3 == 0) {
			System.out.println("삼각형의 넓이는: "+(double)(num1 * num2 / 2));
		}
		else if (num1 != 0 && num2 != 0 && num3 != 0) {
			System.out.println("사다리꼴의 넓이는: "+(double)((num1 + num2)*num3 / 2));
			sc.close();
		}
	}

}

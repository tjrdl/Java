package question03;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean multiple = false;
		System.out.println("양의 정수를 입력하세요: ");
		int number = sc.nextInt();
		
		if(number % 3 == 0) {
			System.out.println("3의 배수이다.");
			multiple = true;
		}
		if(number % 5 == 0) {
			System.out.println("5의 배수이다.");
			multiple = true;
		}
		if(number % 8 == 0) {
			System.out.println("8의 배수이다.");
			multiple = true;
		}
		if(multiple == false) {
			System.out.println("어느 배수도 아니다.");
		}
	}

}

package chapter2;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >=80) {
			System.out.println("Congratulation");
		}
		sc.close();
	}

}

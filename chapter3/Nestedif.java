package chapter3;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 0;
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100): ");
		score = sc.nextInt();
		System.out.println("학년을 입력하세요(1~4): ");
		grade = sc.nextInt();
		

		
		if (score>=60 && grade <=3) {	
			System.out.println("합격!");
		}
		else if (grade == 4 && score >=70) {
			System.out.println("합격");
		}
		
		else {
			System.out.println("불합격!");
		}
		sc.close();
	}

}

package chapter2;

import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점수를 입력(0~100): ");
		char grade;

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		switch (score / 10) {
//		case 10:
//			grade='A';
//			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;

		}
//		if(score>=90) {
//			grade = 'A';
//		}
//		else if (score >=80) {
//			grade = 'B';
//		}
//		else if (score >=70) {
//			grade = 'C';
//		}
//		else if (score >=60) {
//			grade = 'D';
//		}
//		else {
//			grade = 'F';
//		}
//		
//		System.out.println("학점은"+grade+"입니다.");
//		scanner.close();

	}

}

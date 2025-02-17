package question03;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cheating = false;
		int attendrate = 0, totalscore = 0;
		String grade = "A";

		Scanner sc = new Scanner(System.in);
		System.out.print("부정행위 여부(true or false): ");
		cheating = sc.nextBoolean();
		System.out.print("출석률(0~100사이의 정수값): ");
		attendrate = sc.nextInt();
		System.out.print("총점(0~100사이의 정수값): ");
		totalscore = sc.nextInt();

		if ((cheating == true) || (attendrate < 80)) {
			grade = "F";
			System.out.println("학점 = " + grade);
		} else if (totalscore >= 90) {
			grade = "A";
			System.out.println("학점 = " + grade);
		} else if (totalscore >= 80) {
			grade = "B";
			System.out.println("학점 = " + grade);
		} else if (totalscore >= 70) {
			grade = "C";
			System.out.println("학점 = " + grade);
		} else if (totalscore >= 60) {
			grade = "D";
			System.out.println("학점 = " + grade);
		}
		sc.close();
	}

}

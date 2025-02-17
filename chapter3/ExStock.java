package chapter3;

import java.util.Scanner;

public class ExStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 0;
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("코스피 지수 입력(1800~2500): ");
		grade = sc.nextInt();
		System.out.println("환율을 입력하세요(1100~1200): ");
		score = sc.nextInt();
		
		if(grade >=1150) {
			if(2000 <= score && score <=2199) {
				System.out.println("횡보장");
			}
			else if (score >=2200) {
				System.out.println("상승장");
			}
			else {
				System.out.println("하락장");
			}
		}
		else {
			if(2000 <= score && score <=2299) {
				System.out.println("횡보장");
			}
			else if (score >=2300) {
				System.out.println("상승장");
			}
			else {
				System.out.println("하락장");
			}
		}
		
	}

}

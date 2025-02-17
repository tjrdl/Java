package chapter2;

import java.util.Scanner;

// 시간을 입력받아 임금 계산
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int RATE = 10000;
		int hour = 0;
		int pay = 0;
		
		
		System.out.print("시간을 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		
		if(hour>8) {
			pay = (int)(RATE * 8 + (RATE * (hour-8)*1.5));
		}
		else {
			pay = RATE * hour;
		}
		System.out.println("급여는"+pay+"입니다.");
		sc.close();
	}

}

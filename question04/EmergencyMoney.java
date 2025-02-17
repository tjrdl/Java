package question04;

import java.util.Scanner;

public class EmergencyMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>> ");
		int family = sc.nextInt();
		int dollar100 = 0, dollar10 = 0, num = 0, num2 = 0;
		final int dollar = 1200;

		if (family >= 4) {
			num = 1000000;
			num2 = num / dollar;
			dollar100 = num2 / 100;
			dollar10 = (num2 % 100) / 10;

		} else if (family == 3) {
			num = 800000;
			num2 = num / dollar;
			dollar100 = num2 / 100;
			dollar10 = (num2 % 100) / 10;

		} else if (family == 2) {
			num = 600000;
			num2 = num / dollar;
			dollar100 = num2 / 100;
			dollar10 = (num2 % 100) / 10;

		} else if (family == 1) {
			num = 400000;
			num2 = num / dollar;
			dollar100 = num2 / 100;
			dollar10 = (num2 % 100) / 10;

		}
		if (dollar100 > 0) {
			System.out.println("100달러짜리" + dollar100 + "매");

		}
		if (dollar10 > 0) {
			System.out.println("10달러짜리" + dollar10 + "매");
		}

		sc.close();

	}

}

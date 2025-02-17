package chapter2;
import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>> ");
		int a = sc.nextInt();
		double b = a/1200.0;
		double c = a/1500.0;
		double temp = Math.round(b*10) / 10.0;
		System.out.println(a + "원은 $" + temp + "입니다.");
		temp = Math.round(c*10) / 10.0;
		System.out.println(a + "원은 E" +temp + "입니다.");
		sc.close();
	}

}

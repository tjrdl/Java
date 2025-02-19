package Java.chapter4;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate;
	// 메소드를 사용해 멤버변수를 접근해서 사용(보안)
	// getter, setter
	
	public static void setRate(double rate) {
		// 매개변수를 static 멤버로 저장
		CurrencyConverter.rate = rate;
	}
	
	public static double toDollar(double won) {
		return won / CurrencyConverter.rate;
	}
	
	public static double toKWR(double dollar) {
		return dollar * CurrencyConverter.rate;
	}
}


public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = sc.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+Math.round(CurrencyConverter.toDollar(1000000))+"입니다.");
		System.out.println("100$는 "+Math.round(CurrencyConverter.toKWR(100))+"입니다.");
		
	}

}

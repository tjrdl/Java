package chapter2;

import java.util.Scanner;

class A{}
class B{}

public class ExCalculation {

	public static void main(String[] args) {
		// JVM이 수많은 class 중에서도 public class를 찾아감
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 실수 입력>> ");
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		sc.close();
		System.out.println("두수의 합은" + (num1 + num2));
		System.out.println("두수의 차는" + (num1 - num2));
		System.out.println("두수의 곱은" + num1 * num2);
		System.out.println("두수의 나눗셈은" + num1 / num2);
	}
	
}

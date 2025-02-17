package chapter2;
import java.util.Scanner;


public class SumMultiply {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("2개의 정수 입력>> ");
		int num1 = a.nextInt();
		int num2 = a.nextInt();
		a.close();
		System.out.println("두수의 합은"+(num1+num2));
		System.out.println("두수의 곱은"+num1*num2);
	}
}

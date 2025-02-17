package chapter3;

import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i = 1;
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하시오:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(i<=9) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
	}

}

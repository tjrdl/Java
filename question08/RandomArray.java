package Java.question08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int amount = sc.nextInt();
		Random r = new Random();

		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 1; i < amount + 1; i++) {
			int a = r.nextInt(100) + 1;
			array.add(a);
		}
		for (int i = 0; i < array.size(); i++) {
			if (i == 0) {
				System.out.print(array.get(i) + "\t");
			} else {
				System.out.print(array.get(i) + "\t");
				if (i % 10 == 9) {
					System.out.println();
				}
			}
		}
	}

}

package Java.question08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int amount = sc.nextInt();
		Random r = new Random();

		ArrayList<Integer> array = new ArrayList<>();

		Set<Integer> numbers = new HashSet<>();
		// set

		while (numbers.size() < amount) {
			int a = r.nextInt(100) + 1;
			if (numbers.add(a)) {
				array.add(a);
			}
		}

		for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + "\t");
            if ((i + 1) % 10 == 0) { 
                System.out.println();
            }
        }
	}

}

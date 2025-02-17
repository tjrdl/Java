package chapter2;

public class LogicalOperator {

	public static void main(String[] args) {
		// 문자끼리의 비교는 유니코드 크기로 비교
		System.out.println('a' > 'b'); // false
		System.out.println('a' < 'b'); // true

		System.out.println(-1 < 0); // true
		System.out.println(3 >= 2); // true
		System.out.println("===============");

		System.out.println(3.45 <= 2); // f
		System.out.println(3 == 2); // f
		System.out.println(3 != 2); // t
		System.out.println(!(3 != 2)); // f
		System.out.println("===============");

		System.out.println((3 > 2) && (3 > 4)); // f
		System.out.println((3 != 2) || (-1 > 0)); // t
		System.out.println((3 != 2) ^ (-1 > 0)); // t
	}

}

package chapter4;

public class ForeachEx {
	// 열거형: inner class(내부 클래스)형태
	enum Week {
		월, 화, 수, 목, 금, 토, 일
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 1, 2, 3, 4, 5 };
		String names[] = { "apple", "pear", "banana", "cherry", "strawberry", "grape" };
		int sum = 0;

		for (int k : n) {
			System.out.print(k + " ");
			sum += k;

		}
		System.out.println("sum = " + sum);
		for (String s : names) {
			System.out.print(s + " ");

		}
		System.out.println();

		// Week 타입 값을 w로 넘겨받음
		for (Week w : Week.values()) {
			Week str = w;
			// System.out.print(w + " ");
			System.out.print(str + "요일 ");

		}
		System.out.println();
	}

}

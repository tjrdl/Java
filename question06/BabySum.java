package Java.question06;

public class BabySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[120][5];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ((i + 1) * 100) + j + 1;
				sum += arr[i][j];
			}
		}
		System.out.println("10년간 5개 나라의 총 신생아수는 " + sum);
	}

}

package Java.chapter4;

public class CoronaSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [][] = new int[12][3];
		int sum = 0;
		for (int i =0; i<12; i++) {
			for (int j = 0; j<3; j++) {
				array[i][j] = (i+1) * 10 + (j+1);
				sum += array[i][j];
				System.out.println(sum);
			}
			
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}

}

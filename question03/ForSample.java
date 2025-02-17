package question03;

public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i<11; i++) {
			System.out.print(i);
			if (i <10) {
				
				System.out.print("+");
			}
			sum+=i;
		}
		System.out.print("="+sum);
	}

}

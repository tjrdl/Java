package chapter2;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주사위의 눈: "+rollDice());
	}
	public static int rollDice() {
		double x = 6 * Math.random();
		int temp = (int)x + 1;
		return temp;
	}

}

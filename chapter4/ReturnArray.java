package chapter4;

public class ReturnArray {
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i< temp.length; i++) {
			temp[i] = i;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = makeArray();
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}

}

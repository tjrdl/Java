package Java.question05;

public class ReturnArray2 {
	
	public int[] makeArray() {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnArray2 arr2 = new ReturnArray2();
		int arr1[] = arr2.makeArray();
		
		for (int i = 0; i<arr1.length; i++) {
			int sum = arr1[i] + 100;
			System.out.print(sum+" ");
		}
		
		
	}

}

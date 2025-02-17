package chapter4;

public class IrregularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n [][] = {{10,11,12},{20,21},{11,22,33},{44,55}};
		
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j<n[i].length; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

}

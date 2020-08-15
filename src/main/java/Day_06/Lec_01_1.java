package Day_06;

public class Lec_01_1  {

	
	public static void main(String[] args) {
		int [][] A = new int [][] {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		
		int row=0;
		while (row<A.length) {
			int col=0;
			while (col<A[0].length) {
				if (A[row][col]==5) {
					System.out.print(A[row][col]+ " ");
				}
				col++;
			}
			System.out.println();
			row++;
		}
		
		
		
	}

}
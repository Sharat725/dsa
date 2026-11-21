package TwoDimentionArray;

public class SumAllMatrixElement {
	public static void main(String[] args) {
		int[][] arr= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		
		int sum=0;
		for(int[] row:arr) {
			for(int col:row) {
				sum=sum+col;
			}
		}
		System.out.println(sum);
	}
	

}

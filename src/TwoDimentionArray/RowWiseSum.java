package TwoDimentionArray;

public class RowWiseSum {
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int i=0;
		for(int[] row:arr) {
			int sum=0;
			for(int col:row) {
				sum=sum+col;
			}
			System.out.println("Sum of "+i+"  row is:"+sum);
			i++;
		}
	}
}

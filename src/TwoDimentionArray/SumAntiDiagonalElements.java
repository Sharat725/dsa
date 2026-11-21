package TwoDimentionArray;

public class SumAntiDiagonalElements {
	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int i=0;
		int sum=0;
		for(int row=0;row<arr.length;row++) {
			sum=sum+arr[row][arr.length-1-i];
			i++;
		}
		System.out.println(sum);
	}
}

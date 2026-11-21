package TwoDimentionArray;

public class PrintEvenNumbers {
	public static void main(String[] args) {
		int[][] arr= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		
		for(int[] row:arr) {
			for(int col:row) {
				if(col%2==0 ) {
					System.out.println(col);
				}
			}
		}
	}

}

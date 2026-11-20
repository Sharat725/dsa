package TwoDimentionArray;

import java.util.Arrays;

public class JaggedArray {
	public static void main(String[] args) {
		//creation
		int[][] arr = new int[3][];
		
		//value insertion
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[] {6,7,8,9};
		
		//printing values using nested for loop
//		for(int r=0;r<arr.length;r++) {
//			for(int c=0;c<arr[r].length;c++) {
//				System.out.print(arr[r][c]+" ");
//			}
//			System.out.println();
//		}

		
		
		//printing 2D array using for each loop
		for(int[] row:arr) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

		
		
		//printing 2D matrix using builtin method of Arrays class
//		System.out.println(Arrays.deepToString(arr));
		
		
	
	}

}

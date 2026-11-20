package TwoDimentionArray;

import java.util.Arrays;

public class RectangularMatrix {
	public static void main(String[] args) {
		//with new operator
		int[][] arr = new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		
		//without new operator
		int[][] a= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		
		//printing values using nested for loop
//		for(int r=0;r<arr.length;r++) {
//			for(int c=0;c<arr[r].length;c++) {
//				System.out.print(arr[r][c]+" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("***************************");
//		
//		for(int r=0;r<a.length;r++) {
//			for(int c=0;c<a[r].length;c++) {
//				System.out.print(a[r][c]+" ");
//			}
//			System.out.println();
//		}
		
		
		//printing 2D array using for each loop
//		for(int[] row:arr) {
//			for(int col:row) {
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("****************");
//		
//		for(int[] row:a) {
//			for(int col:row) {
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
		
		
		//printing 2D matrix using builtin method of Arrays class
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("********************");
		
		System.out.println(Arrays.deepToString(a));
	}
  
	
}

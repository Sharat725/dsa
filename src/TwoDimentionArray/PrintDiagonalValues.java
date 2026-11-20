package TwoDimentionArray;

public class PrintDiagonalValues {
 public static void main(String[] args) {
	 int[][] arr= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
	 
	//printing values using nested for loop
//		for(int r=0;r<arr.length;r++) {
//			for(int c=0;c<arr[r].length;c++) {
//				if(r==c)
//				System.out.print(arr[r][c]+" ");
//			}
//			System.out.println();
//		}
		
		//using single for loop
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i][i]);
//		}
		
		//using foreach 
		int i=0;
		for(int[] a:arr) {
			System.out.println(a[i]);
			i++;
		}
}
}

package TwoDimentionArray;

public class AntiDiagonalElements {

	public static void main(String[] args) {
		int[][] arr= {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		
		//printing values using nested for loop
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr[r].length;c++) {
				if(r+c==arr.length-1)
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		//using single for loop
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i][arr.length-1-i]);
//		}
		
		//using foreach 
//		int i=0;
//		for(int[] row:arr) {
//			System.out.println(row[arr.length-1-i]);
//			i++;
//		}
	}
}

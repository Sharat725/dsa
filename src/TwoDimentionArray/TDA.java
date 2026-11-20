package TwoDimentionArray;

public class TDA {
	int[][] a;
	
	//creation
	public TDA(int row,int col) {
		a=new int[row][col];
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				a[r][c]=Integer.MIN_VALUE;
			}
		}
		System.out.println("Array is created");
	}
	
	//Insertion
	void insert(int r,int c,int v) {
		try {
			if(a[r][c]==Integer.MIN_VALUE) {
				a[r][c]=v;
				System.out.println("The value"+v+"insert at"+r+","+c);
			}else {
				System.out.println("The value already exist");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid");
		}
	}
	
	//Traversal
	void traverse() {
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				if(a[r][c]!=Integer.MIN_VALUE) {
					System.out.println(a[r][c]+" ");
				}
			}
			System.out.println();
		}
	}
	
	//Search by Value
	void searchByValue(int v) {
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				if(a[r][c]==v) {
					System.out.println("The value found in"+r+","+c);
					return;
				}
			}
		}
		System.out.println("Value not found");
	}
	
	//Search by index
	void searchByIndex(int r,int c) {
		try {
			if(a[r][c]!=Integer.MIN_VALUE) {
				System.out.println("The value at index is"+a[r][c]);
			}
			else {
				System.out.println("Element does not exist");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	//Delete by value
	void deleteByVal(int v) {
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a.length;c++) {
				if(a[r][c]==v) {
					a[r][c]=Integer.MIN_VALUE;
					System.out.println("The value"+v+"got deleted"+r+","+c);
					return;
				}
			}
		}
		System.out.println("Value not found");
	}
	
	//Delete by Index
	void deleteByIndex(int r,int c) {
		try {
			if(a[r][c]!=Integer.MIN_VALUE) {
				a[r][c]=Integer.MIN_VALUE;
				System.out.println("Value deleted");
			}
			else {
				System.out.println("Value not found");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	//Delete whole Array
	void delete() {
		a=null;
		System.out.println("Array deleted");
	}
	
	

	public static void main(String[] args) {
		TDA t=new TDA(2, 2);
		t.insert(0, 0, 10);t.insert(0, 1, 20);
		t.insert(0, 2, 30);t.insert(1, 0, 40);
		t.searchByValue(20);
		t.searchByIndex(1, 1);
		t.deleteByVal(10);
		t.deleteByIndex(1, 0);
		t.traverse();
		t.delete();
	}
}

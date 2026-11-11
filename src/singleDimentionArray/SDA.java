package singleDimentionArray;

public class SDA {
	int[] arr;
	
	// Creation
	public SDA(int size) {
		arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	//Insertion
	public void insert(int index,int value) {
		try {
			if(arr[index]==Integer.MIN_VALUE) {
				arr[index]=value;
				System.out.println("The value is inserted at index "+index+" value is"+value);
			}
			else {
				System.out.println("Value not inserted at index"+index+" value is"+value);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}
	
	// Traversal
	public void traversal() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=Integer.MIN_VALUE) {
			System.out.println(arr[i]);
			}
		}
	}
	
	// SearchByVal
	public void searchByVal(int v) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==v) {
				System.out.println("The value "+v+" found at index "+i);
				return;
			}
			System.out.println("The value not found");
		}
	}
	

	//searchByIndex
	public void searchByIndex(int i) {
		try {
			if(arr[i]!=Integer.MIN_VALUE) {
				System.out.println("The value at index "+i+" is "+arr[i]);
			}
			else {
				System.out.println("Element does not exist");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	//DeleteByVal
	public void deleteByVal(int v) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==v) {
				arr[i]=Integer.MIN_VALUE;
				System.out.println("The value "+v+" as been deleted");
				return;
			}
			System.out.println("The value not found");
		}
	}
	
	//DeleteByIndex
	public void deleteByIndex(int i) {
		try {
			if(arr[i]!=Integer.MIN_VALUE) {
				arr[i]=Integer.MIN_VALUE;
				System.out.println("The value at index "+i+" is deleted");
			}
			else {
				System.out.println("Element does not exist");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	//Deletion of Array
	public void delete() {
		arr=null;
		System.out.println("Array is deleted");
	}
	
	public static void main(String[] args) {
		SDA s=new SDA(5);
		s.insert(0, 10);
		s.insert(1, 20);
		s.insert(2, 30);
		s.insert(3, 40);
		s.insert(4, 50);
		s.insert(5, 60);
		s.traversal();
		s.searchByVal(30);
		s.searchByIndex(1);
		s.deleteByIndex(0);
		s.deleteByVal(20);
		s.traversal();
		s.delete();
		s.traversal();
	}
}

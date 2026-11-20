package TwoDimentionArray;

import java.util.Arrays;

class Employee{
	private int id;
	private String name;
	private double sal;
	public Employee(int id,String name,double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
}
public class TDA1 {
	Employee[][] arr;
	public TDA1(int row,int col) {
		arr=new Employee[row][col];
	}
	public static void main(String[] args) {
		TDA1 t=new TDA1(2,2);
		t.insert(0, 0, new Employee(104, "Sharat", 10000));
		t.insert(0, 1, new Employee(102, "Sanat", 25000));
		t.insert(1, 0, new Employee(103, "Sham", 15000));
		t.insert(1, 1, new Employee(101, "Shine", 20000));
		t.traverse();
//		t.searchByValue(103);
//		t.searchByIndex(1,0);
//		t.deleteByVal(101);
//		t.traverse();
//		t.deleteByIndex(0, 0);
//		t.traverse();
//		t.delete();
//		t.traverse();
		t.sortById();
		System.out.println();
		t.traverse();
		t.sortByName();
		System.out.println();
		t.traverse();  
		
	}
	
	//Insertion
		void insert(int r,int c,Employee v) {
			try {
				if(arr[r][c]==null) {
					arr[r][c]=v;
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
			for(int r=0;r<arr.length;r++) {
				for(int c=0;c<arr.length;c++) {
					if(arr[r][c]!=null) {
						System.out.print(arr[r][c]+" ");
					}
				}
				System.out.println();
			}
		}
		
		//Search by Value
		void searchByValue(int v) {
			for(int r=0;r<arr.length;r++) {
				for(int c=0;c<arr.length;c++) {
					if(arr[r][c].getId()==v) {
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
				if(arr[r][c]!=null) {
					System.out.println("The value at index is"+arr[r][c]);
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
			for(int r=0;r<arr.length;r++) {
				for(int c=0;c<arr.length;c++) {
					if(arr[r][c].getId()==v) {
						arr[r][c]=null;
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
				if(arr[r][c]!=null) {
					arr[r][c]=null;
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
			arr=null;
			System.out.println("Array deleted");
		}	
		
		//sortById
		public void sortById() {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-1-j;j++) {
					if(arr[i][j].getId()>arr[i][j+1].getId()) {
						Employee temp=arr[i][j];
						arr[i][j]=arr[i][j+1];
						arr[i][j+1]=temp;
					}
				}
			}
		}
		
		//sortByName
		public void sortByName() {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-1-j;j++) {
					if(arr[i][j].getName().compareTo(arr[i][j+1].getName())>0) {
						Employee temp=arr[i][j];
						arr[i][j]=arr[i][j+1];
						arr[i][j+1]=temp;
					}
				}
			}
		}		
		
}


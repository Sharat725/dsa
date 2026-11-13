package singleDimentionArray;

public class MainClass {
	Employee[] s;
	public MainClass(int size) {
		s=new Employee[size];
	}
	
	//insertion
	void insert(int index, Employee val) {
		try {
			if(s[index]==null) {
				s[index]=val;
				System.out.println("Value inserted");
			}else {
				System.out.println("Position already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}
	
	//traversal
	void traversal() {
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
				System.out.println(s[i]);
			}
		}
	}
	
	//searchBYValue
	void searchByValue(int id) {
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null && s[i].id==id) {
				System.out.println("Employee found at"+i+" "+s[i]);
				return;
			}
		}
		System.out.println("Employee not found");
	}
	
	//searchByIndex
	void searchByIndex(int index) {
		try {
			if(s[index]!=null) {
				System.out.println(s[index]);
			}else {
				System.out.println("Position is Empty");
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	//deleteByIndex
	void deleteByIndex(int index) {
		try {
			if(s[index]!=null) {
				s[index]=null;
				System.out.println("Employee deleted");
			}
			else {
				System.out.println("Position is empty");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	//deleteByid
	void deleteById(int id) {
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null && s[i].id==id) {
				s[i]=null;
				System.out.println("Employee deleted");
				return;
			}
		}
		System.out.println("Employee not found");
	}
	
	//delete the array
	void delete() {
		s=null;
		System.out.println("Array deleted");
	}
	
	public static void main(String[] args) {
		MainClass obj=new MainClass(5);
		obj.insert(0, new Employee(101, "Sharat", "SE"));
		obj.insert(1, new Employee(102, "Sharat", "SE"));
		obj.insert(2, new Employee(103, "Sharat", "SE"));
		obj.insert(3, new Employee(104, "Sharat", "SE"));
		obj.insert(4, new Employee(105, "Sharat", "SE"));
		obj.traversal();
		obj.searchByIndex(102);
		obj.searchByValue(2);
		obj.deleteByIndex(3);
		obj.deleteById(103);
		obj.traversal();
		obj.delete();
		obj.traversal();
	}
}

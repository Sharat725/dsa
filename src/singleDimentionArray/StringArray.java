package singleDimentionArray;

import java.util.Arrays;

public class StringArray {

	String[] a;
	
	//Creation
	public StringArray(int size) {
		a=new String[size];
	}
	
	//Insertion
	void insert(int i, String v) {
		try {
			if(a[i]==null) {
				a[i]=v;
				System.out.println("Value "+v+ "inserted at index:"+i);
			}
			else {
				System.out.println("Value not inserted at"+i);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
	}
	
	//Traversal
	void traversal() {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=null) {
				System.out.println(a[i]);
			}
		}
	}
	
	//SearchByVal
	void searchByVal(String val) {
		for(int i=0;i<a.length;i++) {
			if(a[i].equals(val)) {
				System.out.println("value found at index"+i);
				return;
			}
		}
		System.out.println("Value not found");
	}
	
	//SearchBYIndex
	void searchByIndex(int i) {
		try {
			if(a[i]!=null){
				System.out.println("The value at index"+i+"is"+a[i]);
			}
			else {
				System.out.println("Element does not exist");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}
	
	//deleteByvalue
	void deleteByValue(String val) {
		for(int i=0;i<a.length;i++) {
			if(a[i].equals(val)) {
				a[i]=null;
				System.out.println("The value "+val+" as been deleted");
				return;
			}
		}
		System.out.println("Value does not found");
	}
	
	//deleteByIndex
	void deleteByIndex(int i) {
		try {
			if(a[i]!=null){
				a[i]=null;
				System.out.println("value deleted at index"+i);
			}
			else {
				System.out.println("Element does not exist");
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
	}
	
	//Deletion of an array
	void delete() {
		a=null;
		System.out.println("Array is deleted");
	}
	public static void main(String[] args) {
		StringArray s=new StringArray(5);
		s.insert(0, "Hi");
		s.insert(1, "Hello");
		s.insert(2, "How");
		s.insert(3, "are");
		s.insert(4, "you");
		s.traversal();
		System.out.println(Arrays.toString(s.a));
//		s.searchByVal("are");
//		s.searchByIndex(0);
//		s.deleteByIndex(1);
//		s.deleteByValue("How");
//		s.traversal();
//		s.delete();
//		s.traversal();
		
		//Sort by Name by bubble sort
		int size=s.a.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(s.a[j].compareTo(s.a[j+1])>0) {
					String temp=s.a[j];
					s.a[j]=s.a[j+1];
					s.a[j+1]=temp;
				}
			}
		}
		s.traversal();
	}
}

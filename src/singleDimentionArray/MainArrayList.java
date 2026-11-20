package singleDimentionArray;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

	List<EmployeeArrayList> l2;
	
	//creation
	public MainArrayList() {
		l2=new ArrayList<EmployeeArrayList>();
	}
	
	//insertion
	void insert(EmployeeArrayList e) {
		l2.add(e);
		System.out.println("Element added");
	}
	
	//traverse
	void traverse() {
		for(EmployeeArrayList x:l2) {
			System.out.println(x);
		}
	}
	
	//searchbyValue
	void searchByValue(int id) {
		for(int i=0;i<l2.size();i++) {
			if(id==l2.get(i).id) {
				System.out.println("Value found at:"+i);
				System.out.println(l2.get(i));
				return;
			}
		}
		System.out.println("Value not found");
	}
	public static void main(String[] args) {
		MainArrayList m=new MainArrayList();
		m.insert(new EmployeeArrayList(101, "Sharat","SE"));
		m.insert(new EmployeeArrayList(102, "Sanat","DE"));
		m.insert(new EmployeeArrayList(103, "Sampat","FE"));
		m.insert(new EmployeeArrayList(104, "Shine","CE"));
		m.insert(new EmployeeArrayList(105, "Sagar","ME"));
		m.traverse();
		m.searchByValue(103);
	
	}
}

package singleDimentionArray;

public class EmployeeArrayList {
	int id;
	String name;
	String dep;
	
	public EmployeeArrayList(int id,String name,String dep) {
		this.id=id;
		this.name=name;
		this.dep=dep;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+dep;
	}
}

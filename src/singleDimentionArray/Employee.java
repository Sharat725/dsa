package singleDimentionArray;

public class Employee {
	  int id;
	  String name;
	  String dep;
	  
	  Employee(int id,String name,String dep){
		  this.id=id;
		  this.name=name;
		  this.dep=dep;
	  }
	  
	 
	public String toString() {
		
		return id+" "+name+" "+dep;
	}
}

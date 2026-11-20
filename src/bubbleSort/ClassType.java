package bubbleSort;

import java.util.ArrayList;
import java.util.List;

class Emp{
	private int id;
	private String name;
	private double sal;
	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
public class ClassType {
public static void main(String[] args) {
	 List<Emp> l1 = new ArrayList<>();

     l1.add(new Emp(105, "sharath", 55000.78));
     l1.add(new Emp(102, "shravani", 42000.54));
     l1.add(new Emp(103, "Chetan", 68000.21));
     l1.add(new Emp(104, "manoj", 49000.99));
     
     //Sort by Id using Bubble Sort
     for(int i=0;i<l1.size();i++) {
    	 for(int j=0;j<l1.size()-1-i;j++) {
    		 if(l1.get(j).getId()>l1.get(j+1).getId()) {
    			 Emp temp=l1.get(j);
    			 l1.set(j, l1.get(j+1));
    			 l1.set(j+1, temp);
    		 }
    	 }
     }
     System.out.println(l1);

    //Sort by Name using BubbleSort
     for (int i = 0; i < l1.size() - 1; i++) {
         for (int j = 0; j < l1.size() - i - 1; j++) {
             if (l1.get(j).getName().compareTo(l1.get(j+1).getName())>0) {
            	 Emp temp = l1.get(j);
                 l1.set(j, l1.get(j + 1));
                 l1.set(j + 1, temp);
             }
             }
         }
     System.out.println(l1);
     }
}

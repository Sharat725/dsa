package singleDimentionArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



class Employee1 {
	private int id;
	private String name;

	
	public Employee1(int id, String name) {
	
		this.id = id;
		this.name = name;
	
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	

}

public class SDA {
	
	public static void main(String[] args) {
		Employee1[] arr= {
				new Employee1(101, "Sharat"),
				new Employee1(103, "Sanat"),
				new Employee1(105, "Sampat"),
				new Employee1(102, "Shine"),
				new Employee1(104, "Sham")
		};
		
		//SortById
		System.out.println("SortById");
		Employee1[] soertedArr=Arrays.stream(arr)
		.sorted(Comparator.comparingInt(e->e.getId()))
		.toArray(Employee1[]::new);
		
		Arrays.stream(soertedArr).forEach(System.out::println);
		
		//SortByName
		System.out.println("SortByName");
		Arrays.stream(arr)
		.sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
		.forEach(System.out::println);
	}

	
}

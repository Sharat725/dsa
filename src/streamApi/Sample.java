package streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,20,80,40,30);
//		Stream<Integer> s1=list.stream()  // Stream creation
//						.filter((no)->no%2==0).sorted();  //filter the based upon condition
//		s1.forEach((no)->System.out.println(no));
//	}
//
//}


//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,20,80,40,30);
//		List<Integer> l1=list.stream()  //Stream creation
//				.collect(Collectors.toList());  //to convert Stream to list
//		l1.forEach((no)->System.out.println(no));
//	}
//
//}


//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,20,80,40,30,20,50,60,30,80,40);
//		List<Integer> l1=list.stream()  //Stream creation
//				.filter((no)->no%2==0).sorted()
//				.collect(Collectors.toList());  //to convert Stream to list (ArrayList)
//		l1.forEach((no)->System.out.println(no));
//	}
//
//}


//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,20,80,40,30,20,50,60,30,80,40);
//		Set<Integer> l1=list.stream()  //Stream creation
//				.filter((no)->no%2==0).sorted()
//				.collect(Collectors.toSet());  //to convert Stream to set(HashSet)
//		l1.forEach((no)->System.out.println(no));
//	}
//
//}

//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,20,80,40,30,20,50,60,30,80,40);
//		Map<Integer,Integer> l1=list.stream()  //Stream creation
//				.filter((no)->no%2==0)
//				.collect(Collectors.toMap(e->e,count->1,(a, b) -> a + b,LinkedHashMap::new));  //to convert Stream to HashMap
//	    
//		System.out.println(l1);
//	}
//
//}

//to get distinct values or remove Dublicates
//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,30,20,20,80,40,30);
//		List<Integer> l1=list.stream()  //Stream creation
////				.distinct()  //to remove dublicates
////				.limit(5)   // gives the first 5 elements
//				.skip(5)    //ignore first 5 elements
//				.collect(Collectors.toList());  //to convert Stream to list
//		l1.forEach((no)->System.out.println(no));
//	}
//
//}



//Sum of distict value
//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,30,20,20,80,40,30);
//		int l1=list.stream()  //Stream creation
//				.distinct()
//				.reduce(0, (a,b)->a+b);
//
//		System.out.println(l1);
//	}
//
//}


//public class Sample {
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(10,51,30,20,80,40,30);
//		Stream<Integer> s1=list.stream()  // Stream creation
//						.map(e->e*2)
//						.filter((no)->no%2==0);  //filter the based upon condition
//		s1.forEach((no)->System.out.println(no));
//	}
//
//}


//FlatMap   flatMap() is used to convert multiple streams into a single stream (flattening).
//public class Sample {
//    public static void main(String[] args) {
//
//        List<List<Integer>> list = Arrays.asList(
//            Arrays.asList(10, 20, 30),
//            Arrays.asList(40, 50, 60),
//            Arrays.asList(70, 80, 90)
//        );
//
//        List<Integer> result = list.stream()
//                .flatMap(l -> l.stream())
//                .collect(Collectors.toList());
//
//        result.forEach(System.out::println);
//    }
//}



// The peek() method is an intermediate operation in Java Stream API. It is mainly used to inspect or debug elements while they are flowing through a Stream without modifying them.
//public class Sample {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
//
//        list.stream()
//            .peek(no -> System.out.println("Original: " + no))
//            .filter(no -> no % 2 == 0)
//            .peek(no -> System.out.println("After filter: " + no))
//            .collect(Collectors.toList());
//    }
//}


// The count() method is used to count the total number of elements present in a Stream.   returns long
//public class Sample {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
//
//        long count = list.stream()
//                         .count();
//
//        System.out.println("Total elements: " + count);
//    }
//}


//The min() method is used to find the smallest element in a Stream based on the given Comparator.
//Example 1: Find the minimum number
//public class Sample {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(10, 51, 30, 20, 80, 40, 30, 20, 50, 60);
//
//        Optional<Integer> min = list.stream()
//                .min(Comparator.naturalOrder());
//
//        System.out.println("Minimum number: " + min.get());
//    }
//}

// Example 2: Find minimum using Comparator.comparing()
//class Employee {
//    int id;
//    String name;
//    double salary;
//
//    Employee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//    
//    public double getSalary() {
//        return salary;
//    }
//}
//
//public class Sample {
//    public static void main(String[] args) {
//
//        List<Employee> list = Arrays.asList(
//            new Employee(1, "Rahul", 30000),
//            new Employee(2, "Amit", 25000),
//            new Employee(3, "Kiran", 40000)
//        );
//
//        Employee emp = list.stream()
//                .min(Comparator.comparing(Employee::getSalary))  //using Comparator.comparing
//                .get();
//
//        System.out.println(emp.name + " : " + emp.salary);
//    }
//}

// The max() method is used to find the largest element in a Stream based on the given Comparator.
// Example 1: Find the maximum number
//public class Sample {
//    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(10, 51, 30, 20, 80, 40, 30, 20, 50, 60);
//
//        Optional<Integer> max = list.stream()
//                .max(Comparator.naturalOrder());
//
//        System.out.println("Maximum number: " + max.get());
//    }
//}

// Example 2: Find the employee with the highest salary
//class Employee {
//    int id;
//    String name;
//    double salary;
//
//    Employee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//}
//
//public class Sample {
//    public static void main(String[] args) {
//
//        List<Employee> list = Arrays.asList(
//            new Employee(1, "Rahul", 30000),
//            new Employee(2, "Amit", 25000),
//            new Employee(3, "Kiran", 40000)
//        );
//
//        Employee emp = list.stream()
//                .max(Comparator.comparing(Employee::getSalary))
//                .get();
//
//        System.out.println("Highest Salary Employee: " + emp.name);
//        System.out.println("Salary: " + emp.salary);
//    }
//}








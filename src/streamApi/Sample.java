package streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
//		List<Integer> list=Arrays.asList(10,51,30,20,80,40,30);
//		List<Integer> l1=list.stream()  //Stream creation
//				.filter((no)->no%2==0).sorted()
//				.collect(Collectors.toList());  //to convert Stream to list
//		l1.forEach((no)->System.out.println(no));
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
public class Sample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,51,30,30,20,20,80,40,30);
		int l1=list.stream()  //Stream creation
				.distinct()
				.reduce(0, (a,b)->a+b);

		System.out.println(l1);
	}

}

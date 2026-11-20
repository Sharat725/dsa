package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sampleeee {
public static void main(String[] args) {
	List<List<Integer>> l1=Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8));
	System.out.println(l1);
//l1.stream().skip(3).forEach(n->System.out.println(n));
	List<Integer> list=l1.stream().flatMap(n-> n.stream()).toList();
	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i)+" ");
	}
//	List a1=Arrays.of
		//	Arrays.asList("a","d","b");
	
	
}}

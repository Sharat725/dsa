package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//import java.util.stream.Collectors;

public class SecMax {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(56,20,98,45,72,63,43,96);
		Optional<Integer> l1=list.stream()
							.distinct()
//							.sorted()
							.sorted(Comparator.reverseOrder())
							.skip(2)
							.findFirst();
//							.collect(Collectors.toList());
							
//		l1.forEach((no)->System.out.println(no));
		System.out.println(l1);
	}
	

}

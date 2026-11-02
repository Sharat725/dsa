package comparatorInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
//		Comparator<Integer> com=(Integer a,Integer b)->(a%10>b%10) ? 1 : -1;
		Comparator<Integer> com=(a,b)->(a%10>b%10) ? 1 : -1;
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(42,61,23,78,84,39));
//		Collections.sort(list,com);
		Collections.sort(list,com.reversed());
		list.forEach((no)->System.out.println(no));
	}

}

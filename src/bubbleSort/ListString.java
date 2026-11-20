package bubbleSort;

import java.util.Arrays;
import java.util.List;

public class ListString {
	public static void main(String[] args) {
		List<String> l1=Arrays.asList("Sharat","Sanat","Sampat","Shine","Kiran");
		
		for(int i=0;i<l1.size();i++) {
			for(int j=0;j<l1.size()-1-i;j++) {
				if(l1.get(j).compareTo(l1.get(j+1))>0) {
					String temp =l1.get(j);
					l1.set(j, l1.get(j+1));
					l1.set(j+1, temp);
				}
			}
		}
		System.out.println(l1);
	}
}

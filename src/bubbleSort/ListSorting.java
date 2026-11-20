package bubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSorting {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(6,4,3,1,5,2));
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.size()-1-i;j++) {
				if(arr.get(j)>arr.get(j+1)) {
					int temp=arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
		System.out.println(arr);
	}
}

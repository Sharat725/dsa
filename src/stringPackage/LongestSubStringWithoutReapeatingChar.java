package stringPackage;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithoutReapeatingChar {
	public static void main(String[] args) {
		String s="abcabcdb";
		int max=0,j=0,start=0;
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(j));
				j++;
			}
			set.add(s.charAt(i));
			if(set.size()>max) {
				max=set.size();
				start=j;
			}
		}
		System.out.println(max+" "+s.substring(start,start+max));
	}

}

package braces;

import java.util.Stack;

public class Braces {
	static String isValid(String s) {
		if(s.length()%2!=0) {
			return "Invalid";
		}
		
		Stack<Character> st=new Stack<Character>();
		for(char ch:s.toCharArray()) {
			if(ch=='(' || ch=='[' || ch=='{') {
				st.push(ch);
			}
			else if(st.isEmpty()) {
				return "Invalid";
			}
			else {
				char top=st.pop();
				if((ch==']' && top!='[')||
						(ch=='}' && top!='{')||
							(ch==')' && top!='(')) {
					return "Invalid";
				}
			}
		}
		
		if(st.isEmpty()) {
			return "Valid";
		}
		
		else {
			return "Invalid";
		}
	}
	public static void main(String[] args) {
		String s="{[({))]}";
		System.out.println(isValid(s));
	
}
}

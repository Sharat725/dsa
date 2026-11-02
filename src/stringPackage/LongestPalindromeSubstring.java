package stringPackage;

public class LongestPalindromeSubstring {
	public static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str="java";
		String word="";
		int max=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String sub=str.substring(i,j);
				if(isPalindrome(sub) && sub.length() > max) {
					max=sub.length();
					word=sub;
				}
			}
		}
		System.out.println(word+" "+max);
		
	}
}

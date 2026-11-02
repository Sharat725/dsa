package recursion;

public class OddSum {
	static int odd(int n) {
		if(n>10) {
			return 0;
		}
		return n+odd(n+2);
	}
	public static void main(String[] args) {
		System.out.println(odd(1));
	}
}

package recursion;

public class EvenSum {
	static int even(int n) {
		if(n>10) {
			return 0;
		}
		return n+even(n+2);
	}
	public static void main(String[] args) {
		System.out.println(even(0));
	}
}

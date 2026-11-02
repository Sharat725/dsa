package recursion;

public class Summation {
	private static int sum(int no) {
		if(no==0) {
			return 0;
		}
		return no+sum(no-1);
	}
	public static void main(String[] args) {
		System.out.println(sum(6));
	}
}

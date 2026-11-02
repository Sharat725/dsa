package recursion;

public class EvenAndOdd {
	static void print(int n) {
		if(n>=10) {
			return;
		}
//		if(n%2==0) {
//			System.out.println(n);
//		}
		if(n%2!=0) {
			System.out.println(n);
		}
		print(n+1);
		
	}
	public static void main(String[] args) {
		print(0);
	}
}

package recursion;

public class Fibonacci {
	static int fib(int no) {
		if(no==0) {
			return 0;
		}
		if(no==1 || no==2) {
			return 1;
		}
		return fib(no-1)+fib(no-2);
	}
	public static void main(String[] args) {
//		System.out.println(fib(6));
		for(int i=0;i<8;i++) {
			System.out.println(fib(i)+" ");
		}
	}
}

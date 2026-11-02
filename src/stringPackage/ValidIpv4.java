package stringPackage;

public class ValidIpv4 {
	public static boolean isValid(String ip) {
		String[] parts=ip.split("\\.");
		if(parts.length != 4) {
			return false;
		}
		for(String part:parts) {
			if(part.length()==0 || part.length()>3) {
				return false;
			}
			if(part.charAt(0)=='0' && part.length()>1) {
				return false;
			}
			for(int i=0;i<part.length();i++) {
				if(!Character.isDigit(part.charAt(i))) {
					return false;
				}
			}
			int num=Integer.parseInt(part);
			if(num<0 || num>255) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isValid("192.0.56.78"));
		System.out.println(isValid("192. .56.78"));
		System.out.println(isValid("1923.23.56.78"));
		System.out.println(isValid("275.23.56.78"));
		System.out.println(isValid("192.01.56.78"));
		System.out.println(isValid("192.23.56.00"));
		System.out.println(isValid("256.23.56.78"));
		System.out.println(isValid("1ab. .200.10"));
		System.out.println(isValid("198.010.256.12"));
		
	}

}

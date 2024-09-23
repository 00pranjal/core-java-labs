package pranjal.lab3;

import java.util.Arrays;

public class Ex8 {
	
	public static boolean ifPositiveString(String s) {
		
		String copy = s;
		
		char ar[] = s.toCharArray();
		Arrays.sort(ar);
		String ss = new String(ar);
		
		if (copy.equals(ss))
			return true;
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		String s = "black";
		
		System.out.println(ifPositiveString(s));
		
	}
	


}

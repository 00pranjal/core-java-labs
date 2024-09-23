package pranjal.lab2;

import java.util.Arrays;

public class Ex3 {
	
	static String reverseNum(int n) {
		
		//String s = Integer.toString(n); this works too
		
		StringBuilder s = new StringBuilder(String.valueOf(n));
		s = s.reverse();
		String ss = s.toString(); // stringBuilder to string
		return ss;
		
	}
	
	public static int[] getSorted(int ar[]) {
		
		
		for(int i=0;i<ar.length;i++) {
			
			ar[i] = Integer.parseInt(reverseNum(ar[i]));
		}
		Arrays.sort(ar);
		return ar;
		
	}
	public static void main(String[] args) {
		
		int ar[]= {121, 56, 654, 12, 900};
		int ans[] = getSorted(ar);
		
		for( int a : ans) {
			System.out.println(a);
		}
	}
}

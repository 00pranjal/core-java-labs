package pranjal.lab2;

import java.util.Arrays;

public class ex1 {
	
	public static int getSecondSmallest(int ar[]) {
		
		Arrays.sort(ar);
		
		return ar[1];
		
	}
	public static void main(String[] args) {
		
		int ar[] = {5,3,7,6,1,9};
		
		int ans = getSecondSmallest(ar);
		System.out.println(ans);
	}

}

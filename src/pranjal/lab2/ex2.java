package pranjal.lab2;

import java.util.Arrays;

public class ex2 {

	public static String[] sortStrings(String[] arr) {

		
		int l = arr.length;

		int mid = (l + 1) / 2;
		
		Arrays.sort(arr);
		
		String[] r = new String[l];

		for (int i = 0; i < mid; i++) {
			r[i] = arr[i].toUpperCase();
		}

		for (int i = mid; i < l; i++) {
			r[i] = arr[i].toLowerCase();
		}

		return r;

	}
	public static void main(String[] args) {
		
		String arr[] = {"venue","harrier","nexon","alto","thar"};
		
		String s[]= sortStrings(arr);
		
		for(String st : s) {
			System.err.print(st+" ");
		}
	}
}

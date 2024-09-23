package pranjal.lab1;

import java.util.Scanner;

public class ex6 {
	
	public static int calculateDifference(int n) {
		
		int s=0;
		int ss=0;
		
		for(int i=1;i<=n;i++) {
			ss=ss+ i;
			s=s+ (i*i);
		}
		
		ss = ss * ss;
		
		return s - ss;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n= sc.nextInt();
		
		int ans = calculateDifference(n);
		System.out.println(ans);
		sc.close();
	}

}

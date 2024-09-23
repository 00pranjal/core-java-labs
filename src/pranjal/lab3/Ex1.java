package pranjal.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a line of integers");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer obj = new StringTokenizer(s);
		
		int sum =0;
		while(obj.hasMoreTokens()) {
			
			int num = Integer.parseInt(obj.nextToken());
			System.out.println(num);
			
			sum += num;
		}
		
		System.out.println("sum: "+sum);
		sc.close();
	}

}

package pranjal.lab5.Ex1;

import java.util.Scanner;

public class AgeCheck {
	
	public static void checkAge(int n) throws AgeException{
		
		if (n <= 15) {
			throw new AgeException("Invalid Age");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			checkAge(age);
			System.out.println("Valid Age");
		}
		catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}

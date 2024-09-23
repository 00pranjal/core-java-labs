package pranjal.lab5.Ex2;

import java.util.Scanner;

public class NameCheck {
	
	public static void nameCheck(String firstName, String lastName) throws InvalidNameException {
		
		if(firstName.isBlank() || lastName.isBlank()) {
			
			throw new InvalidNameException("Invalid Name");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = sc.nextLine();
		
		System.out.println("Enter last name");
		String lname = sc.nextLine();
		
			
		
		try {
			nameCheck(fname, lname);
			System.out.println("valid name");
		}
		catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}

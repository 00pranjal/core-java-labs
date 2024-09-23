package pranjal.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

	public static List<String> getValues(HashMap<String, String> hashMap) {

		List<String> values = new ArrayList<String>(hashMap.values());

		Collections.sort(values);

		return values;

	}

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key-value pairs. Type 'exit' to stop");

		while (true) {

			System.out.println("Enter key");
			String key = sc.nextLine();

			if (key.equalsIgnoreCase("exit")) {
				break;
			} else {
				
				System.out.println("Enter value");
				String value = sc.nextLine();
				
				map.put(key, value);
				
			}
		}
		
		List<String> ans = getValues(map);
		
		ans.forEach(System.out::println);
		sc.close();

		}
	}

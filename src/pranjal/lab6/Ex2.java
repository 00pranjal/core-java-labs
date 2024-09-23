package pranjal.lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
	
	public static Map<Character, Integer> countChars(char[] arr){
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : arr) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		return map;
		
	}
	public static void main(String[] args) {
		
		char arr [] = {'a','n','a','m','m','m','a','o','p','g','o'};
		
		Map<Character, Integer> ans = countChars(arr);
		System.out.println(ans);
		
	}

}

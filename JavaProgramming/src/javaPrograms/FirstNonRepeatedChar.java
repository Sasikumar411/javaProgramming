package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) 
	{
		String str="Sasi".toLowerCase();
		
		Map<Character, Integer> count=new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : str.toCharArray()) {
			if(count.get(ch)==1) {
				System.out.println("First non repeating character: "+ch);
				break;
			}
		}

	}

}

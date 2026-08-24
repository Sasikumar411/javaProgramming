package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {

	public static void main(String[] args) 
	{
		String str="Sasiikkumaar".toLowerCase();
		/*
		Map<Character, Integer> count=new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : str.toCharArray()) {
			if(count.get(ch)==2) {
				System.out.println("First repeated character: "+ch);
				break;
			}
		}
		 */
		
		Set<Character>seen=new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			if(seen.contains(ch)) {
				System.out.println("First repeated character: "+ch);
				break;
			}
			seen.add(ch);
		}
		
	}

}







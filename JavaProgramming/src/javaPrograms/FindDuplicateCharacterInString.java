package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) 
	{
		String str="Sassiikkumar".toLowerCase();
		
		Set<Character> seen=new HashSet<>();
		Set<Character> duplicates=new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			if(!seen.add(ch)) {
				duplicates.add(ch);
			}
		}
		System.out.println(duplicates);

	}

}

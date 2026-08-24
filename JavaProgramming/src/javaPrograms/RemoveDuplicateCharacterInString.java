package javaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		
		String str="Programming";
		
		Set<Character> unique=new LinkedHashSet<>();
		
		for(char ch : str.toCharArray()) {
			unique.add(ch);
		}
		System.out.println(unique);
		
		StringBuilder result=new StringBuilder();
		
		for(char ch:unique) {
			result.append(ch);
		}
		System.out.println(result);

	}

}

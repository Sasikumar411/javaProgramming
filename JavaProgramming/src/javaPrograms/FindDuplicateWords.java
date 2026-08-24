package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) 
	{
		String str="Java Selenium Java API Selenium Testing".toLowerCase();
		
		String words[]=str.split(" ");
		
		Set<String> seen=new HashSet<>();
		Set<String> duplicates=new HashSet<>();
		
		for(String word:words) {
			
			if(!seen.add(word))
				duplicates.add(word);
		}
		System.out.println("Duplicates: "+duplicates);
		

	}

}

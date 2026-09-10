package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInString {
	
	public static void main(String[] args) {
		
		String str="Java Automation".toLowerCase();
		/*
		Set <Character> seenLetters = new HashSet<>();
		Set <Character> duplicates = new HashSet<>();
		
		for(char ch : str.toCharArray()) 
		{
			if(!seenLetters.add(ch)) {
				duplicates.add(ch);
			}
		}
		System.out.println(duplicates);
		*/
		
		char[] arr=str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
				}
			}
			System.out.print(arr[i]);
		}
		
	}

}

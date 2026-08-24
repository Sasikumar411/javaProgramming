package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachChar {

	public static void main(String[] args) 
	{
		String str="Sasikumar".toLowerCase();
		
		Map<Character, Integer> wordCount=new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			wordCount.put(ch, wordCount.getOrDefault(ch, 0)+1);
		}
		System.out.println(wordCount);
	}

}

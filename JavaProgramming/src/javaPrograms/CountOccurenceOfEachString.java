package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachString {

	public static void main(String[] args) 
	{
		String str="Java selenium and Java API Testing";
		
		String arr[]=str.split(" ");
		
		Map<String, Integer> count=new HashMap<>();
		
		for(String word:arr) {
			
			count.put(word, count.getOrDefault(word, 0)+1);
		}
		System.out.println(count);

	}

}

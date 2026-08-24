package programs_practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingCollection {

	public static void main(String[] args) 
	{
		String str="Java API Automation".toLowerCase();
		
		
		Set<Character> seenLetter=new HashSet<>();
		Set<Character> duplicates=new HashSet<>();
		
		for(char ch : str.toCharArray())
		{
			if(ch == ' ')
				continue;
			
			if(!seenLetter.add(ch))
			{
				duplicates.add(ch);
			}
			
				
		}
		System.out.println(duplicates);
				

	}

}

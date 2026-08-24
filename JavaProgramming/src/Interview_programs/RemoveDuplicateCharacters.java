package Interview_programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) 
	{
		String input="Java Automation";
		
		Set<Character>seen=new HashSet();
		StringBuilder result=new StringBuilder();
		
		for(char ch:input.toCharArray())
		{
			if(ch==' ')
			{
				result.append(ch);
				continue;
			}
			
			char lower=Character.toLowerCase(ch);
			
			if(!seen.contains(lower)) {
				seen.add(lower);
				result.append(ch);
			}
		}
		System.out.println("Input: "+input);
		System.out.println("Output: "+result);

	}

}

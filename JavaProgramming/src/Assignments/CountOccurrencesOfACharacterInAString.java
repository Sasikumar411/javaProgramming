package Assignments;

import java.util.Arrays;

public class CountOccurrencesOfACharacterInAString {

	public static void main(String[] args) 
	{
		//for a word
		/*String s="Java programming with selenium";
		String total_words[]=s.split("\\s");
		System.out.println(Arrays.toString(total_words));
		String target="java";
		int count=0;
		
		for(int i=0; i<total_words.length; i++)
		{
			if(total_words[i].equalsIgnoreCase(target))
				count++;
			
				
			
		}
		System.out.println("The target string "+target+" is occurred "+count+" times.");
		*/
		
		//for a single word
		/*String s="Java programming with selenium";
		char target='p';
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==target)
				count++;
				
		}
		System.out.println(count);*/
		
		//Approach 2:
		String s="java selenium with automation";
		int total_len=s.length();
		
		String After_remove=s.replace("u", "");
		int total_len1=After_remove.length();
		
		System.out.println(total_len-total_len1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

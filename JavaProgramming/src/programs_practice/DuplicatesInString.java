package programs_practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) 
	{
		String str="Java API Automation".toLowerCase().replace(" ", "");
		
		Set<Character> duplicates=new HashSet<>();
		
		char[] arr=str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					duplicates.add(arr[i]);
				}
			}
		}
		System.out.println(duplicates);
	}

}

package javaPrograms;

public class FindTheLongestWord {

	public static void main(String[] args) 
	{
		String str="I'm Sasikumar from Chennai";
		
		String words[]=str.split(" ");
		
		String longestWord="";
		
		for(String word : words) {
			if(word.length() > longestWord.length()) 
				longestWord=word;
		}
		System.out.println("Longest word: "+longestWord);
		System.out.println("Length of the longest word: "+longestWord.length());

	}

}

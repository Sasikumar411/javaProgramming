package javaPrograms;

public class FindTheNumberOfWordsInString {

	public static void main(String[] args) 
	{
		String str="Java API automation selenium".toLowerCase();
		
		String words[]=str.split(" ");
		
		int wordsCount=0;
		
		for(String word : words) {
			
			wordsCount++;
		}
		System.out.println("Number of words: "+wordsCount);
	}

}

package Interview_programs;

public class CountOccurancesOfString {

	public static void main(String[] args) 
	{
		String s="Welcome to java and selenium with java and core Java";
		String target="java";
		
		String words[]=s.split("\\s+");
		int count=0;
		
		for(String word:words) {
			if(word.equalsIgnoreCase(target)) {
				count++;
			}
		}
		System.out.println("Count of occurances: "+count);
	}

}

package javaPrograms;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		String str="Sasikumar".toLowerCase();
		
		int vowelCount=0;
		int consonantCount=0;
		
		for(char ch : str.toCharArray()) {
			
			if(ch >= 'a' && ch <= 'z') {
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
			}
		}
		System.out.println("Vowels = "+vowelCount);
		System.out.println("consonants = "+consonantCount);

	}

}

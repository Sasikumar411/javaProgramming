package Assignments;

public class RemoveJunkOrSpecialCharactersInString {

	public static void main(String[] args)
	{
		String s="!@#$%^&*(*&^%$#@#$%S%^&eleni%^&um";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		String s1="!@#$%^&*(*&^%$ Sasikum#$%^ar";
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		
		String str= "!@#$%^~%^&@*S$%^&S%^&S&*(s %^&#$5678%^&";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}

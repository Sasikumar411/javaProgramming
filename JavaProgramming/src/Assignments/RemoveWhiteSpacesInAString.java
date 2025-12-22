package Assignments;

public class RemoveWhiteSpacesInAString {

	public static void main(String[] args) 
	{
		String str="java    selenium   automation  program   ";
		str=str.replaceAll("\\s+", " ").trim();
		System.out.println(str);
		
		String s="s  A  s  AS   sjhd  sjh  s ";
		s=s.replaceAll("\\s+", "").trim();
		System.out.println(s);

	}

}

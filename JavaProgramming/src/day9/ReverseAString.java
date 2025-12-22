package day9;

public class ReverseAString {

	public static void main(String[] args) 
	{
		
		//Approach:1
		
		/*String s="selenium";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)             //using charAT() and length method
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("The reverse string is:"+rev);*/

		
		//Approach:2 -without using string methods
		
		/*String s="Welcome";
		String rev="";
		
		char a[]=s.toCharArray();      //it helps to convert a string into character array
		System.out.println(a);
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
		//Approach:3  -using StringBuffer class
		
		StringBuffer s=new StringBuffer("Welcome");
		System.out.println(s.reverse());
		
		//Approach:3  -using StringBuilder class
		
		StringBuilder sc=new StringBuilder("welcome");
		System.out.println(sc.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

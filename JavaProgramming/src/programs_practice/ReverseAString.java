package programs_practice;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		
		String s1=sc.next();
		/*String rev="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			System.out.print(s1.charAt(i));
			
		}
		
*/
		StringBuilder rev=new StringBuilder(s1);
		System.out.println(rev.reverse());
		
		
	}

}

package Assignments;
import java.util.Scanner;

public class CheckTheStringPalindrome {

	public static void main(String[] args) 
	{
		/*String s="elel";
		String org_value=s;
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(org_value.equals(rev))
		{
			System.out.println("The string is palindrome:"+rev);	
		}	
		else
		{
			System.out.println("The string is not a palindrome:"+rev);
		}
			*/
		

		//take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		
		String s=sc.next();
		String org_s=s;
		
		String rev="";
		
		int len=s.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		if(org_s.equals(rev))
			System.out.println("The string is palindrome:"+rev);
		else
			System.out.println("The string is not a palindrome:"+rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

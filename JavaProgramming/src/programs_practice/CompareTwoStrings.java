package programs_practice;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word: ");
		
		String s1=sc.next();
		System.out.println("Enter the word: ");
		String s2=sc.next();
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		

	}

}

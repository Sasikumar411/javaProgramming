package programs_practice;

import java.util.Scanner;

public class ConverStringToLowerAndUpperCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String1: ");
		
		String s1=sc.next();
		
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		
		System.out.println("Enter a String2:");
		String s2=sc.next();
		
		System.out.println(s2);
		System.out.println(s2.toLowerCase());

	}

}

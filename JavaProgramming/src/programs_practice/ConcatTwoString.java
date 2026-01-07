package programs_practice;

import java.util.Scanner;

public class ConcatTwoString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1: ");
		
		String s1=sc.next();
		System.out.println("Enter the String2: ");
		String s2=sc.next();
		
		System.out.println(s1.concat(" "+s2));
		
		

	}

}

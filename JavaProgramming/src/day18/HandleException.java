package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) 
	
	{
        System.out.println("Program is startted.....");
		
		Scanner sc=new Scanner(System.in);
		
		//Ex:1
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		
		try
		{
		System.out.println(100/num);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data");
		}
		System.out.println("Program is exited.....");
		System.out.println("Program is completed.....");

	}

}

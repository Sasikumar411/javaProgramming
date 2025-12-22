package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter a number");
		
		//int num=sc.nextInt();
		//System.out.println(num);
		
		
		/*System.out.println("Enter a decimal number");
		double d=sc.nextDouble();
		System.out.println("Given number is:"+d);*/
		
		System.out.println("Enter the city:");
		String s=sc.next();
		System.out.println("Your city is:"+s);
		

	}

}

package programs_practice;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		for(int i=0; i<=15; i++)
		{
			System.out.println(i+" x "+num+"="+(num*i));
		}

	}

}

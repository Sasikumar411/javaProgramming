package programs_practice;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		try {
			num=num/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled.");
		}
			
		
		
		
		
		

	}

}

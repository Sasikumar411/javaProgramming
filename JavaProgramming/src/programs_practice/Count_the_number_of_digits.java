package programs_practice;

import java.util.Scanner;

public class Count_the_number_of_digits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}

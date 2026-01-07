package programs_practice;

import java.util.Scanner;

public class PrintEvenAndODD {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		
		int size=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
				even_count++;
			else
				odd_count++;
		}
		System.out.println("Even count: "+even_count);
		System.out.println("Odd count: "+odd_count);

	}

}

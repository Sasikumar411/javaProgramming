package programs_practice;

import java.util.Scanner;

public class Sum_of_an_array {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		
		int size=sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		
		System.out.println("Enter "+size+" elements: ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
			sum=sum+arr[i];
		}	
		System.out.println(sum);
		
		

	}

}

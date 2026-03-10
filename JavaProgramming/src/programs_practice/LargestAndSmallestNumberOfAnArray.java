package programs_practice;

import java.util.Scanner;

public class LargestAndSmallestNumberOfAnArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1;i<size;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
				
		}
		System.out.println("Largest of num is: "+max);
		System.out.println("Smallest of num is: "+min);
		

	}

}

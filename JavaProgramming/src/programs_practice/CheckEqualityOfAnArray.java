package programs_practice;

import java.util.Scanner;

public class CheckEqualityOfAnArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		
		int size1=sc.nextInt();
		
		int arr1[]=new int[size1];
		System.out.println("Enter the elements of an array1: ");
		for(int i=0; i<size1; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
        System.out.println("Enter the size of an array: ");
		
		int size2=sc.nextInt();
		
		int arr2[]=new int[size2];
		System.out.println("Enter the elements of an array2: ");
		
		for(int j=0; j<size2; j++)
		{
			arr2[j]=sc.nextInt();
		}
		
		boolean status=true;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0; i<arr1.length; i++)
			{
				if(arr1[i]!=arr2[i])
					status=false;	
			}
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		

	}

}

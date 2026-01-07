package programs_practice;

import java.util.Scanner;

public class SearchElementInAnArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		
		int size=sc.nextInt();
		
		boolean status=false;
		
		int arr[]=new int[size];
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("Enter the search element: ");
		int search_element=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(search_element==arr[i])
			{
				System.out.println("Element found: "+arr[i]);
				status=true;
				break;
			}
			
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}

	}
}



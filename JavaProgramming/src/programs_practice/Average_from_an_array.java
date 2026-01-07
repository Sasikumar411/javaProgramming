package programs_practice;

import java.util.Scanner;

public class Average_from_an_array {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		
		int size=sc.nextInt();
		int sum=0;
		
		int arr[]=new int[size];
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
			sum+=arr[i];
		}
		System.out.println(sum);
		
		double avg=sum/size;
		
		System.out.println(avg);

	}

}

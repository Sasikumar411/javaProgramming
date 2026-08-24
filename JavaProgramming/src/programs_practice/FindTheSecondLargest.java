package programs_practice;

import java.util.Scanner;

public class FindTheSecondLargest {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		/*
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MAX_VALUE;
		
		for(int num:arr)
		{
			if(num>largest)
			{
				second_largest=largest;
				largest=num;
			}
			else if(num > second_largest && num!=largest)
			{
				second_largest=num;
			}
		}
		System.out.println("Second largest: "+ second_largest);*/
		
		
		int largest=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		System.out.println("Largest: "+largest);
		
		
	}
}
















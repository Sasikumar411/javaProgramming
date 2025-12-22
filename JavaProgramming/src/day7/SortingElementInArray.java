package day7;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {100,500,300,200,600,400};
		System.out.println("Before sorting.....");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);  //elements will be sorted
		System.out.println("After sorting.....");
		System.out.println(Arrays.toString(a));
	}

}

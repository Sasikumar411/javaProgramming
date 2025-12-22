package day7;

import java.util.Arrays;

public class SortingStringsInArray {

	public static void main(String[] args) 
	{
		//char s[]= {'S','A','C','D','R','T'};
		
		String c[]= {"bike", "sasi", "Car", "Deivam"};
		System.out.println("Before sorting..."+Arrays.toString(c));
		
		Arrays.sort(c);
		System.out.println("After sorting..."+Arrays.toString(c));

	}

}

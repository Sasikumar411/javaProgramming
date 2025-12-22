package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) 
	{
		//mutable
		/*int a[]= {10,40,30,20,50};
		System.out.println("before sorting..."+Arrays.toString(a));
		
		Arrays.sort(a); //mutable
		System.out.println("After sorting..."+Arrays.toString(a));*/

		//immutable
		String s="welcome";
		System.out.println(s);
		String concatstring=s.concat("to java");  //string is a example for immutable
		System.out.println(s);
		System.out.println(concatstring);
		
		
	}

}

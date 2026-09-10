package javaPrograms;

import java.util.Arrays;

public class CheckWhetherTwoStringsAreAnagrams {

	public static void main(String[] args) {
		
		String str1="Throw".toLowerCase();
		String str2="Worth".toLowerCase();
		
		//Check length of the string
		if(str1.length() != str2.length()) {
			System.out.println("Length are not matching, So strings are not an anagram!");
			return;
		}
		
		//Convert them into an array
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		
		//Sorting them
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Checks anagram or not
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not an anagram");
		}
		

	}

}

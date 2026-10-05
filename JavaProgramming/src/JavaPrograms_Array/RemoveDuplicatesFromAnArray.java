package JavaPrograms_Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) 
	{
		int arr[]= {10, 20, 10, 20, 30, 40};
		
		Set<Integer> unique=new LinkedHashSet<>();
		
		for(int num : arr) {
			unique.add(num);
		}
		System.out.println(unique);

	}

}

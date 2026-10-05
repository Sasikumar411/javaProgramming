package JavaPrograms_Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindUniqueElements {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40, 50, 60, 10};
		
		Set<Integer> uniqueElements = new LinkedHashSet<>();
		
		for(int num : arr) {
			uniqueElements.add(num);
		}
		System.out.println(uniqueElements);

	}

}

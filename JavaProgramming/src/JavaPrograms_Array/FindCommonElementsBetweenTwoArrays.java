package JavaPrograms_Array;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {10, 20, 30, 40, 50};
		int arr2[]= {15, 20, 30, 45, 53};
		
		Set<Integer>set = new HashSet<>();
		
		// Add elements of first array
		for(int num : arr1) {
			set.add(num);
		}
		
        // Check elements of second array
		for(int num : arr2) {
			if(set.contains(num)) {
				System.out.println(num);
			}
		}

		

	}

}

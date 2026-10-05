package JavaPrograms_Array;

public class FindTheSmallestNumber {

	public static void main(String[] args) 
	{
		int arr[]= {10,2,56,29,20};
		
		int smallest=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Smallest number of the array is: "+smallest);

	}

}

package JavaPrograms_Array;

public class FindTheLargestInArray {

	public static void main(String[] args) 
	{
		int arr[]= {10,13,24,15,290};
		
		int largest=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]>largest)
				largest=arr[i];	
		}
		System.out.println("Largest number of this array: "+largest);
		
	}

}

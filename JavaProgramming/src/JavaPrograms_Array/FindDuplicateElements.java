package JavaPrograms_Array;

public class FindDuplicateElements {

	public static void main(String[] args) 
	{
		int arr[]={10, 20, 10, 40, 50};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					
					System.out.println("Duplicates: "+arr[i]);
				}
			}
		}

	}

}

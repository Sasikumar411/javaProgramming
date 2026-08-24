package Interview_programs;

public class CheckEqualityOfAnArray {

	public static void main(String[] args) 
	{
		int arr1[]= {10,20,30,40};
		int arr2[]= {11,22,33,44};
		
		boolean status=true;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]!=arr2[i])
					status=false;
			}
		}
		else {
			status=false;
		}
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}

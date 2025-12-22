package Assignments;

public class FindMissingInNumberInArray {

	public static void main(String[] args) 
	{
		//Array should not have duplicates
		//Array no need to be in sorted order
		//Values should be in range
		
		int a[]= {1,2,3,4,5,7,8,9,10};
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
			
		}
		System.out.println("Sum of elements in array:"+sum1);
		
		int sum2=0;
		
		for(int i=1; i<=10; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of the elements in array:"+sum2);
		
		System.out.println("Missing num in the array is:"+(sum2-sum1));
		

	}

}

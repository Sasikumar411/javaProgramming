package Assignments;

public class FindSumofElementsInAnArray {

	public static void main(String[] args) 
	{
		int y[]= {6,3,7,2,9};
		
		int sum=0;
		
		for(int i=0; i<y.length; i++)
		{
			sum=sum+y[i];
		}
		System.out.println("Sum of the value is:"+sum);
		

	}

}

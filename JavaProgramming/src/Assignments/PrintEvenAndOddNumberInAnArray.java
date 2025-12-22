package Assignments;

public class PrintEvenAndOddNumberInAnArray {

	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,6,7};
	
		int even_count=0;
		int odd_count=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
		}
		System.out.println("Total value of even is:"+even_count);
		System.out.println("Total value of odd is:"+odd_count);

	}

}

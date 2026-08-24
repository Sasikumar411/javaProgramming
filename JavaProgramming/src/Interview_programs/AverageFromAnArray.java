package Interview_programs;

public class AverageFromAnArray {

	public static void main(String[] args) 
	{
		int a[]= {10,20,23,12,4};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		double avg=(double) sum/a.length;
		System.out.println(avg);

	}

}

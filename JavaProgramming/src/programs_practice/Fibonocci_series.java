package programs_practice;

public class Fibonocci_series {

	public static void main(String[] args) 
	{
		int num=10;
		int n1=0, n2=1, sum=0;
		
		System.out.print("Fibonocci series: ");
		
		for(int i=1; i<=num; i++)
		{
			sum=n1+n2;  
			System.out.print(n1+ " ");
			
			
			n1=n2;
			n2=sum;
			
		}

	}

}

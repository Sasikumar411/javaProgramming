package Interview_programs;

public class FibanocciSeries {

	public static void main(String[] args) 
	{
		int num=8;
		
		int n1=0, n2=1, sum=0;
		
		for(int i=1; i<=num; i++)
		{
			sum=n1+n2;
			System.out.print(n1+" ");
			
			n1=n2;
			n2=sum;
		}
	}
		
	}
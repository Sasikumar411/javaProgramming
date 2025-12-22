package Assignments;

public class FindThePrimeOrNot {

	public static void main(String[] args) 
	{
		int num=7;
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				count++;
			}
			if(count==2)
			{
				System.out.println(num+":this is the prime numer:");
			}
			else
			{
				System.out.println(num+":this is not a prime number");
			}
		}
		else
		{
			System.out.println("This is not a prime number");
		}

	}

}

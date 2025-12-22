package day5;

public class ForLoop {

	public static void main(String[] args)
	{
//Example:1    print 1-10 numbers		

		/*for(int i=0; i<=10; i++)
		{
			System.out.println(i);
		}*/
		
//Example:2      print 1-10 only even numbers
		
		for(int i=2; i<=10; i++)
		{
			if (i%2==0)
			{
				System.out.println(i+" "+"Even");
			} 
			else
			{
				System.out.println(i+" "+"Odd");
			}

	}
	}
}



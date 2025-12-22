package Assignments;

public class SmallestOf3Numbers {

	public static void main(String[] args) 
	{
		int a=12,b=2,c=-1;
		if(a<=b && a<=c)
		{
			System.out.println("Smallest number is:"+a);
		}
		else if(b<=c && b<=a)
		{
			System.out.println("Smallest number is:"+b);
		}
		else
			System.out.println("Smallest number is:"+c);
	}

}

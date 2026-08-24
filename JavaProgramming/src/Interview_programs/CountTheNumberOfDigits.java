package Interview_programs;

public class CountTheNumberOfDigits {

	public static void main(String[] args) 
	{
		int num=93928;
		
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}

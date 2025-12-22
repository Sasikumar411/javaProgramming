package Assignments;

public class PalindromeNumbers {

	public static void main(String[] args) 
	{
		int num=16561;
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(org_num==rev)
		{
			System.out.println("This is the palindrome number"+rev);
			
		}
		else
		{
			System.out.println("This is the not a palindrome number"+rev);
		}

	}

}

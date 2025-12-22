import java.util.Scanner;

public class P1 {

	public static void main(String[] args) 
	{
		/*int a[]= {100,200,30,40,20,10};
		int search_element=30;
		boolean status=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element got found");
				status=true;
				break;
			}
			
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
		*/
		
		/*int a[]= {10,30,40,50};
		for (int i=a.length-1; i>=0;i--)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		*/
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		
		String s=sc.next();
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		*/
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		
		String s=sc.next();
		String org_s=s;
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		if(rev.equals(org_s))
		{
			System.out.println(rev+" :palindreom");
		}
		else
		{
			System.out.println(rev+" :Not a palindrome");
		}
		*/
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		/*int s=sc.nextInt();
		//int org_s=s;
		int even_count=0;
		int odd_count=0;
		
		while(s!=0)
		{
			int rem=s%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else {
				odd_count++;
			}
			s=s/10;
			
			
		}
		System.out.println("even"+even_count);
		System.out.println("odd"+odd_count);
		*/
		
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
				if(count==2)
				{
					System.out.println("Prime number: "+num);
					
				}
				else 
				{
					System.out.println("Not a prime number"+num);
				}
			
			
		}
		else {
			System.out.println("This is  not a prime number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}

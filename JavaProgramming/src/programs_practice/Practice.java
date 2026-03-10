package programs_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the size of an array: ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements: ");
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		
		/*System.out.println("Enter the String: ");
		
		String s=sc.next();
	    System.out.println(s);
	    
	    String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}*/
		
		/*System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		int n1=0, n2=1, sum=0;
		
		for(int i=1; i<num; i++)
		{
			sum=n1+n2;
			System.out.print(n1+" ");
			
			n1=n2;
			n2=sum;
			
		}*/
		
	/*	System.out.println("Enter the size of the list: ");
		
		int n=sc.nextInt();
		
		List<Integer> fiblist=new ArrayList<>();
		
		if(n>=1)
		{
			fiblist.add(0);
		}
		if(n>=2)
		{
			fiblist.add(1);
		}
		
		
		
		for(int i=2; i<n; i++)
		{
			int next=(fiblist.get(i-1)+fiblist.get(i-2));
			fiblist.add(next);
		}
		System.out.println("Fibonocci series: "+fiblist);
		
		*/
		
		/*System.out.println("Enter the String: ");
		
		String str=sc.next().toLowerCase();
		
		int vowels=0;
		int cons=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<= 'z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vowels++;
					
				}
				else {
					cons++;
				}
			}
			else {
				System.out.println("Not a alphabets");
			}
		}
		
		System.out.println(vowels);
		System.out.println(cons);
*/
		/*System.out.println("Enter the size of the list: ");
		
		int n=sc.nextInt();
		
		List<Integer> fiblist=new ArrayList<>();
		
		if(n>=1)
		{
			fiblist.add(0);
		}
		if(n>2)
		{
			fiblist.add(1);
		}
		
		for(int i=2;i<n;i++)
		{
			int next=fiblist.get(i-1) + fiblist.get(i-2);
			fiblist.add(next);
		}
		
		System.out.println(fiblist);
			*/
		
		/*System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		long fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		*/
		
		/*System.out.println("Enter the String: ");
		
		String s=sc.nextLine();
		
		String result="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
			   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				result=result+ch;
			}
			else if((ch >='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				result= result+ "*";
			}
			else {
				result=result+ch;
			}
		}
		System.out.println(result);
		
		*/
		
		/*int arr[]= {10,20,30,40,50};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i] != largest)
			{
				secondLargest=arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		
		*/
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of terms:");
		
		int n=sc.nextInt();
		
		List<Integer> fiblist=new ArrayList<>();
		
		if(n>=1)
		{
			fiblist.add(0);
		}
		if(n>=2)
		{
			fiblist.add(1);
		}
		
		for(int i=2; i<=n; i++)
		{
			int next=fiblist.get(i-1) + fiblist.get(i-2);
			fiblist.add(next);
		}
		System.out.println(fiblist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		

	}


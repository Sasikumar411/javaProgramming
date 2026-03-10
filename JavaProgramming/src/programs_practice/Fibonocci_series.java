package programs_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
		
		int n=sc.nextInt();
		
		List<Integer> fiblist=new ArrayList<Integer>();
		
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
		

	}
	
	

}

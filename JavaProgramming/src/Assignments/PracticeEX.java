package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeEX {

	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b=sc.nextInt();
		
		System.out.println("Before swap: "+ a + "  " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap: "+ a +"  "+b);*/
		
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the person age: ");
		int person_age=sc.nextInt();
		
		if(person_age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero");
		}
		*/
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the 2nd number:");
		int b=sc.nextInt();
		
		System.out.println("Enter the 3rd number");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("largest number is:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("largest number is:"+b);
		}
			
		else
		{
			System.out.println("largest number is:"+c);
		}
		*/
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		
		System.out.println("Enter the number:");
		int c=sc.nextInt();
		
		if(a<b && a<c)
		{
			System.out.println("Smallest number is:"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Sammlest number is:"+b);
		}
		else
		{
			System.out.println("Smallest number is:"+c);
		}
		*/
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the week name:");
		
		String week_name=sc.next();
		
		switch (week_name)
		{
		case "sunday":System.out.println("week no:1");break;
		case "monday":System.out.println("week no:2");break;
		case "tuesday":System.out.println("week no:3");break;
		case "wednesday":System.out.println("week no:4");break;
		case "thursday":System.out.println("week no:5");break;
		case "friday":System.out.println("week no:6");break;
		case "saturday":System.out.println("week no:7");break;
		default: System.out.println("Invalid week name");
		}*/
		
		//for loop
		/*for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}*/
		
		/*for(int i=0; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" "+"Even");

			}
			else
			{
				System.out.println(i+" "+"Odd");
			}
		}*/
		
		/*Object obj[]= {"Sasi",10,true,'S',20.5};
		
		for(int i=0; i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}*/
		
		/*Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value:");
		int size=sc.nextInt();   //getting input size
		
		int arr[]=new int[size]; //create an array
		
		System.out.println("Enter "+ size + " elemetns:");
		
		// take array elements
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//read elements in array
		System.out.println("Array elements are:");
		for(int i=0; i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the search element: ");
		int search_element=sc.nextInt();
		boolean status=false;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==search_element)
			{
				System.out.println("Element got found: "+arr[i]);
				status=true;
				break;
			}
			
			
		}
		if(status==false)
		{
			System.out.println("Element not found");
		
		}*/
		
		/*int a[]= {10,20,30,40,50};
		int search_element=20;
		boolean status=false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element got found "+a[i]);
				status=true;
				break;
			}
		}
		if(status==false)
			System.out.println("Element not found");
		*/
		
		/*Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the value:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter "+ size +" elements:");
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the repeated number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
			
		}
		System.out.println(count);*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		int rev=0;
		
		while (num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("The reverse number is: "+rev);*/
		
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
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
			System.out.println("This is palindrome:"+rev);
		}
		else
		{
			System.out.println("This is not a palindrome:"+rev);
		}*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
		int odd_num=0;
		int even_num=0;
		
		while(num!=0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_num++;
			}
			else {
				odd_num++;
			}
			num=num/10;
		}
		System.out.println(odd_num);
		System.out.println(even_num);*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
		int sum=0;
		
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);*/
		
		/*Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		int sum=0;
		System.out.println("Enter the elements:");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		int arr[]=new int[4];
		int odd_count=0;
		int even_count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			
		}
		System.out.println(even_count);
		System.out.println(odd_count);*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		int arr[]=new int[5];
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even numbers are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd numbers are:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		sc.close();
		*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				
					count++;
			}
			if(count==2)
			{
				System.out.println("This is prime number:"+num);
			}
			else
			{
				System.out.println("This is not a prime number:"+num);
			}
			
			
		}
		else {
			System.out.println("This is not a prime number: "+num);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

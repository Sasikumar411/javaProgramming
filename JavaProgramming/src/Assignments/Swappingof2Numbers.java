package Assignments;

import java.util.Scanner;

public class Swappingof2Numbers {

	public static void main(String[] args) 
	{
		/*int a=10, b=15;
		a+=5;
		b-=5;
		System.out.println(a);
		System.out.println(b);
		
*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values: ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}

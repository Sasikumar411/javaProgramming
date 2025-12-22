package day18;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program is startted.....");
		
		Scanner sc=new Scanner(System.in);
		
		//Ex:1
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(100/num); //Arithmetic exceptiom
		*/
		
		//Ex:2
		
		/*int a[]=new int[5];  //0-4 is index value
		
		System.out.println("Enter the position(0-4)");
		int pos=sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value;
		System.out.println(a[pos]);  //ArrayIndexOutOfBoundsException
		*/
		
		//Ex:3
		
		/*String s="welcome";
		int num=Integer.parseInt(s);
		System.out.println(num);       //NumberFormatException
		*/
		
		//Ex:4
		String s=null;                 
		System.out.println(s.length());   //NullPointerException
		
		
		System.out.println("Program is exited.....");
		System.out.println("Program is completed.....");
		
		
		
			

	}

}

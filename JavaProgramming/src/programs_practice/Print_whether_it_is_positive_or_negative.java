package programs_practice;

import java.util.Scanner;

public class Print_whether_it_is_positive_or_negative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive number:"+num);
		}
		else if(num<0) {
			System.out.println("Negative number:"+num);
		}
		else
		{
			System.out.println("Given number is zero:"+num);
		}

	}

}

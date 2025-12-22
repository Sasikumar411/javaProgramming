package day18;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		String s="welcome";
		
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException a)   //Exception is a super class, which is parent of all kind of exception class
		{
			System.out.println("Handled exception......");
			System.out.println(a.getMessage());	
		}
		
		finally
		{
			System.out.println("You entered into finally block........");
		}
		
		System.out.println("Program is finished.......");


	}

}

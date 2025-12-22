package day18;

public class MltipleCatchBlocks {

	public static void main(String[] args) 
	{
		System.out.println("Program is started...........");
		
		String s=null;
		
		try 
		{
		System.out.println(s.length());
		}
		/*catch(ArithmeticException a)
		{
			System.out.println("Handled exception......");
			System.out.println(a.getMessage());
		}
		catch(NullPointerException a)
		{
			System.out.println("Handled exception......");
			System.out.println(a.getMessage());
		}
		catch(NumberFormatException a)
		{
			System.out.println("Handled exception......");
			System.out.println(a.getMessage());
		}*/
		
		catch(Exception a)   //Exception is a super class, which is parent of all kind of exception class
		{
			System.out.println("Handled exception......");
			System.out.println(a.getMessage());	
		}
		System.out.println("Program is finished.......");

	}

}

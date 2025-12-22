package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException
	{
		System.out.println("Program started.......");
		System.out.println("Program in prograss.......");
		
		Thread.sleep(5000);
		
		
		FileInputStream fis=new FileInputStream("C:\\TEXT.txt");
		
		//Approach:2 (Try & catch block)
		
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Program finished.......");
		System.out.println("Program exited.......");
		

	}

}

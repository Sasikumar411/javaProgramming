package day17;

public class DataConversionMethods {

	public static void main(String[] args) 
	{
		// String --->int
		
		//String s="welcome"; //cannot convert into int
		
		/*String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/
		
		// String ---> double
		
		/*String s1="10.5";
		String s2="30.5";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));*/
		
		//String -->Boolean
		//String s="sasi";         //other than true, if we pass any string that will return false only.
		//System.out.println(Boolean.parseBoolean(s));
		
		//int, double, boolean --> String
		
		int a=10;
		double d=10.5;
		char C='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(C);    //char into string format is possible.
		System.out.println(s);
		
		s=String.valueOf(bool);
		System.out.println(s);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

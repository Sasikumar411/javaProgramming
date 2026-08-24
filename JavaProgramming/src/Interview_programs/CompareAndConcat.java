package Interview_programs;

public class CompareAndConcat {

	String s1;
	String s2;
	
	
	CompareAndConcat(String s1, String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	
	void checkEqual()
	{
		if(s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Not equal");
	}
	
	void concatString()
	{
		System.out.println(s1.concat(s2));
	}

	
	public static void main(String []args)
	{
		CompareAndConcat c1=new CompareAndConcat("Sasi", "kumar");
		
		c1.checkEqual();
		c1.concatString();
	}
}



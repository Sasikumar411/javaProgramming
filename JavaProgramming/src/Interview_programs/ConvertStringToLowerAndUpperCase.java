package Interview_programs;

public class ConvertStringToLowerAndUpperCase {

	String s1;
	String s2;
	
	ConvertStringToLowerAndUpperCase(String s1, String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	
	void convertLowerCase()
	{
		System.out.println(s1.toLowerCase());
	}
	
	void convertUpperCase()
	{
		System.out.println(s1.toUpperCase());
	}
	
	public static void main(String[] args) 
	{
		ConvertStringToLowerAndUpperCase c1=new ConvertStringToLowerAndUpperCase("Sasi", "KUMAR");
		
		c1.convertLowerCase();
		c1.convertUpperCase();
	}

}

package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) 
	{
		//declared the variable
		
		//String s="Welcome"; //no:1
		//String s=new String("Welcome"); //no:2
		//System.out.println(s);
		
//Methods:1
		
		//length()- returns length of a string(number of character)
		/*String s="Welcome";
		s.length();
		System.out.println(s.length());  //7
		System.out.println("Welcome".length());  //Direct string value //7*/
		
		
		//concat()- joining strings
		String s1="Welcome ";
		String s2="to java ";
		String s3="Automation";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim()- remove spaces right and left side
		String s="    welcome    ";
		s.length();
		System.out.println("before trimming:"+s.length());
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println("After trimming:"+s.trim().length());
		
		//CharAt()- return character from a string based on index
		// index starts from 0
		s="welcome";
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(0));
		
		//contains()- retruns always only a boolean values, which are "true" / "false"
		//checks string is part of main string or not
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("Wel")); //fase
		System.out.println(s.contains("COME"));
		
		//equals(), equalsIgnoreCase()- compare strings
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equalsIgnoreCase("Welcome")); //true
		
		//replace()- it replace single/mutliple/sequence of character in a string
		s= "welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'X')); //replace a single character
		System.out.println(s.replace("selenium", "playwright")); //replace multiple characters
		
		//substring()-extract substring from the main string.(In this method we have to specify the index value to extract the strng)
		//starting index-0
		//ending index-1
		s="selenium";
		System.out.println(s.substring(1,5));
		System.out.println(s.substring(0,3));

		//toUpperCase()   toLowerCase()
		s="weLcOme";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split()- split the string into multiple parts based on delimeter
		s="abc12345@gmail.com";
		String a[]=(s.split("@"));
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		
		//Ex:01
		String amount="$15,20,30";  //exp output: 152030
		System.out.println(amount.replace("$", ""));
		System.out.println(amount.replace("$","").replace(",",""));
		
		//Ex:02
		s="abc,123@xyz";  //exp output: abc   123   xyz
		
		String arr1[]=s.split(",");
		System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1[0]); //abc
		System.out.println(arr1[1]); //123
		System.out.println(arr2[1]); //xyz
		
		//Ex:3
		s="abc 123 xyz";   //space is the delimeter here
		String ar[]=s.split(" ");
		System.out.println(Arrays.toString(ar)); //abc, 123
		
		// * % ^ & ( ) -you cannot use as delimter
		
		//Ex:4
		String name="John Kennedy";
        //System.out.println(name.contains("john"));  //false
        System.out.println(name.replace('J', 'j').contains("john")); //true
        System.out.println(name.toLowerCase().contains("john"));
	    
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
				


	}

}

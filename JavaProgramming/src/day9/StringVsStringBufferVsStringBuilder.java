package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) 
	{
		//String -immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s); //immutable, cannot change original value of (s)string
		
		//StringBuffer - mutable
		
		StringBuffer sc=new StringBuffer("welcome ");
		sc.append("to java");  //append class is helps to concat the values in StringBuffer
		System.out.println(sc);  //mutable, can change original value of (sc)StringBuffer
		
		//StringBuilder - mutable

		StringBuilder sb=new StringBuilder("welcome ");
		sb.append("to java");
		System.out.println(sb);  //mutable, can change original value of (sc)StringBuilder
	}

}

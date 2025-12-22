package day19;

//Upcasting - converting value from smaller ----> larger

//int ---> long
//float --> double

//downcasting- converting value from larger ----> smaller

//long ---> int
//double ---> float



public class TypeCastingConcept {

	public static void main(String[] args) 
	{
		//upcasting - automatic process ---> smaller to larger
		
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);*/
		
		/*float floatvalue=10.5f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		*/
		
		//downcasting - manual process ---> larger to smaller
		
		/*long longvalue = 2000000;
		int intvalue=(int) longvalue;
		System.out.println(intvalue);*/
		
		/*double doublevalue=125.4;
		float floatvalue=(float)doublevalue;
		System.out.println(floatvalue);*/
		
		//Example 1:
		
		/*int i=100;
		double d=i;             //upcasting
		System.out.println(d); //100.0
		*/
		
		//Example 2:
		
		double d=10.5;
		int i=(int)d;           //downcasting
		System.out.println(i);
  

	}

}

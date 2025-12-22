package day6;
/*1) Declare an array
2) add values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array*/

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
        // Declare and adding values in an array   
		
		//Approach:1
		
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//approach:2
		
		int a[]= {100,200,300,400,500};
		
		// find length of an array
		System.out.println("Length of an array:"+a.length);
		
		//read single value from an array
		System.out.println(a[4]);
		
		//read all the values from an array
		//normal for loop
		/*for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		
		//enhanced for loop / for .each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}

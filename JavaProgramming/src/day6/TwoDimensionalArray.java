package day6;

public class TwoDimensionalArray {

	public static void main(String[] args)
	{
		//delaring array   Approach:1
		
		/*int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		
		//Approach:2
		
		int a[][]= {{100,200}, {300,400}, {500,600}, {700,800,900}};
		
		//find size of an array
		
		//System.out.println("length of rows:"+a.length);
		//System.out.println("length of columns:"+a[3].length);
		
		
		//read a single value from an array
		//System.out.println("The value is:"+a[2][1]);
		
		//read all the values in a multi dimensional array
		
		/*for (int r=0; r<a.length; r++)     //outer for loop
		{
			for (int c=0; c<=a[r].length-1; c++)  //inner for loop
				
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		*/
		
		//enhanced for loop for read all values in multi dimensional array
		
		for (int arr[]:a)
		{
			for (int x:arr )
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		}
	}

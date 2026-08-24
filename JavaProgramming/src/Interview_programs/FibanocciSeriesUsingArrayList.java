package Interview_programs;

import java.util.ArrayList;

public class FibanocciSeriesUsingArrayList {

	public static void main(String[] args) 
	{
		int num=8;
		
		System.out.print("Fibonacci series: ");
		
		ArrayList<Integer>fiblist=new ArrayList<>();
		
		if(num>=1)
			fiblist.add(0);
		if(num>=2)
			fiblist.add(1);
		
		for(int i=2; i<num; i++) {
			int next=fiblist.get(i-1) + fiblist.get(i-2);
			fiblist.add(next);
			
		}
		System.out.println(fiblist);
			
	}
}

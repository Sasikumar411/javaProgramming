package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		//Declaration
		
		HashSet myset=new HashSet();     //direct method to declaration
		//Set myset=new HashSet();
		
		//HashSet <String>myset=new HashSet<String>();
		
		//adding element to the hashset
		myset.add(100);
		myset.add("sasi");
		myset.add(10.5);
		myset.add(true);
		myset.add('D');
		myset.add(null);
		myset.add(100);
		myset.add(null);
		System.out.println(myset);
		
		//remove the element from hashset
		myset.remove("sasi");
		System.out.println(myset);
		
		//size of an hashset
		System.out.println(myset.size());
		
		//accessing specific element from hashset - not possible, we should convert into arraylist then access
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);   //[null, 100, D, 10.5, true]
		System.out.println(al.get(2)); //D
		
		//Read all the elements using for each loop
		
		for(Object x:myset)
		{
			System.out.println(myset);
		}
		
		//using Iterator
		Iterator it=myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//clear all the elements in hashset
		myset.clear();
        System.out.println(myset.isEmpty());
		
		
		
		
		

	}

}

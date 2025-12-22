package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		//declaration
		//Map hm=new HashMap(); //if we created declaration like this, we can store any type data into it
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  //only a numbers and letters we can store into it
		
		//adding pairs to the hashmap
		hm.put(101, "John");
		hm.put(102, "Sasi");
		hm.put(103, "John");
		hm.put(104, "Shoe");
		hm.put(105, "Pen");
		hm.put(106, "John");
		System.out.println(hm);    //{101=John, 102=Sasi, 103=John, 104=Shoe, 105=Pen, 106=John}
		
		//find size of a hashmap
		System.out.println(hm.size());  //6
		
		//remove pair from hashmap
		hm.remove(103);
		System.out.println(hm);    //{101=John, 102=Sasi, 104=Shoe, 105=Pen, 106=John}
		
		//access value of a key
		Object h=hm.get(102);     //102 is a key
		System.out.println(h);   //Sasi
		
		//get all the keys from the hashmap
		System.out.println(hm.keySet());    //[101, 102, 104, 105, 106]
		System.out.println(hm.values());    //[John, Sasi, Shoe, Pen, John]
		System.out.println(hm.entrySet());  //[101=John, 102=Sasi, 104=Shoe, 105=Pen, 106=John]
		
		//reading data from hashmap
		//1) using for each loop
		
		/*for(int k:hm.keySet())
		{
			System.out.println(k+"        "+hm.get(k));  //whatever store in k it will get and print			
		}
		*/
		
		//2) using Iterator
		Iterator <Entry<Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry entry=it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		//clear all the elements from hashmap
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
		
		
		
		
		


	}

}

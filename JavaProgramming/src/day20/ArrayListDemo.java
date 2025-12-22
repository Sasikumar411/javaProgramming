package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		ArrayList mylist=new ArrayList();     //Hetrogeneous data declaration
		//List mylist=new ArrayList();
		
		//ArrayList <Integer> mylist=new ArrayList<Integer>();  //Homogeneous data declaration
		
		//adding data into arraylist
		
		mylist.add(100);
		mylist.add(20.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(20.5);
		mylist.add(null);
		mylist.add(null);
		
		//size of an arraylist
		System.out.println(mylist.size());
		
		//printing array list
		System.out.println("Printing data from ArrayList: "+mylist); //[100, 20.5, Welcome, A, true, 100, 20.5, null, null]
		
		//remove element from arraylist
		mylist.remove(5);
		System.out.println("After removing: "+mylist);   //[100, 20.5, Welcome, A, true, 20.5, null, null]
		
		//Insert element in the arraylist
		mylist.add(3, "sasi");
		System.out.println(mylist); //[100, 20.5, Welcome, sasi, A, true, 20.5, null, null]
		
		//Modified element in the arraylist
		mylist.set(3, "Priya");
		System.out.println(mylist);  //[100, 20.5, Welcome, Priya, A, true, 20.5, null, null]
		
		//Access specific element from arraylist
		System.out.println(mylist.get(2));  //here 2 is index   //Welcome
		
		//Reading all the elements from arraylist
		
		//1) using normal for loop
		
		/*for(int i=0; i<mylist.size(); i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		//2) using for each loop
		
		/*for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		//3) using iterator
		//Iterator it=mylist.iterator();
		
		/*while(it.hasNext())       //it will check the element is there or not
		{
			System.out.println(it.next());
		}
		*/
		 
		//System.out.println(it.next());   //it will retunred only firest value in the arraylist   //100
		
		//checking arraylist empty or not
		System.out.println(mylist.isEmpty());
		
		//remove multiple elements from an arraylist
		
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		mylist2.add("Priya");
		mylist.removeAll(mylist2);
		System.out.println(mylist);        //[20.5, A, true, 20.5, null, null]
		
		
		//remove/clear all the elements from an arraylist
		mylist.clear();
		System.out.println(mylist.isEmpty());



		

	}

}

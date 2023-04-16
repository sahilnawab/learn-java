package example;

import java.util.ArrayList;
import java.util.Collections;
public class ArreyLists 
{
	/**
	 * @param s
	 */
	public static void main(String []s) 
	{
	ArrayList<Integer> list = new ArrayList();
	//add elements
	list.add(2);
	list.add(23);
	list.add(54);
	list.add(78);
	System.out.println(list);

	//get elements
	int ele = list.get(0); // store element for printing it
	System.out.println(ele);
	//add elements between
	list.add(1, 65);
	System.out.println(list);
	//size of array list
	int size = list.size();
	System.out.println(size);
	System.out.println("*****************************");
	//remove elements
	list.remove(3);
	System.out.println(list);
	//loops for array listં,
	
	for (int i=0;i<list.size();i++) 
	{
		System.out.print(list.get(i));
		System.out.print(" ");
		
	}
	System.out.println();
	System.out.println("_____________________________________");
	//sorting
		Collections.sort(list);
		System.out.println(list);
	}
}
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		arraylist1.add("Raj"); // 0 index
		arraylist1.add("Priya"); // 1 index
		arraylist1.add("Reena"); // 2 index
		arraylist1.add("Rohan"); // 3 index
		
		System.out.println("The sixe of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
		arraylist1.set(1, "Supriya"); //to replace the value at 1st position
		
		System.out.println("The element at 0 index is " + arraylist1.get(0));
		arraylist1.remove(0);
		
		System.out.println("The sixe of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
		
		
	//Iterating through Array list
		
		for(int index=0;index<arraylist1.size();index++)
		{
			System.out.println(arraylist1.get(index));
		}
		
		for(String name: arraylist1)
		{
			System.out.println(name);
		}
		
		
		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//Sorting of an array list
		
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		
	}

}

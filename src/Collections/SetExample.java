package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet does not maintain any order
		HashSet<String> set1 = new HashSet<String>();
			
		set1.add("Rick");
		set1.add("Raj");
		set1.add("Mira");
		set1.add("Reena");
		set1.add("Ajay");
		set1.add(null);
		
		System.out.println(set1);
		
		
		//LinkedHashSet always maintains the order in which the data is inserted
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		set2.add("Rick");
		set2.add("Raj");
		set2.add("Mira");
		set2.add("Reena");
		set2.add("Ajay");
		set2.add(null);
		
		System.out.println(set2);
		
		
		//TreeSet always maintains the order in an ascending order (alphabetic wise)
		//TreeSet does not add null value and throws error if done
		TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("Rick");
		set3.add("Raj");
		set3.add("Mira");
		set3.add("Reena");
		set3.add("Ajay");
	//	set3.add(null); //TreeSet do not allow null values
		
		System.out.println(set3);
		

/*		//Home work - Remove duplicate word
 
		String str1 = "Clean World Green World"; //Input 
		String str1 = "Clean World Green"; //output after removing the Duplicate should be like this

		
		String str="hello world clean world";
        String [] arr=str.split(" ");
        HashSet<String >hs=new HashSet<String>();
        for (int index=0;index<arr.length;index++)
        {
            hs.add(arr[index]);
        }
        //hs.add(arr[1]);
        System.out.println("hs"+hs);
        
  */
		
		
	}

}

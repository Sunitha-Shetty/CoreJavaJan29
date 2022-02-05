package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Suraj");
		map1.put(2, "ABC");
		map1.put(3, "Rohit");
		map1.put(10, "Chitra");
		map1.put(4, "Arun");
		
		System.out.println(map1);
		
		//update the data in map
		map1.put(2, "John");
		System.out.println(map1);
		
		//delete the entry
		map1.remove(10);
		System.out.println(map1);
		
		
		System.out.println(map1.get(3));
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet())
		{
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		
		for(Integer val : map1.keySet())
		{
			System.out.println("Key is " +val);
			System.out.println("Value is " +map1.get(val));
		}
		
		for(String val : map1.values())
		{
			System.out.println("Value is " +val);
		}
		
		
// =============================================
		
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		
		map2.put(1, "Suraj");
		map2.put(2, "ABC");
		map2.put(3, "Rohit");
		map2.put(10, "Chitra");
		map2.put(4, "Arun");
		
		System.out.println(map2);
		

// =============================================
		
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
				
		map3.put(1, "Suraj");
		map3.put(2, "ABC");
		map3.put(3, "Rohit");
		map3.put(10, "Chitra");
		map3.put(4, "Arun");
				
		System.out.println(map3);
		
		
		
		
/* Home work
	
		String str1 = "Clean India Green India Love India";
	output
		Clean -1
		India -3
		Green -1
		Love -1
*/
		
		

	}

}

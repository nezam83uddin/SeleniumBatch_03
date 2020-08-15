package Day_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_01 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Shohel");
		hmap.put(2, "Ali");
		hmap.put(3, "Sajib");

		
		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		hmap1.put(4, "Koly");
		hmap1.put(6, "Nafiz");
//		hmap1.putAll(hmap);
		
		
		for (Integer key : hmap1.keySet()) {
			if (hmap1.containsKey(4)) {
				System.out.println(hmap1.get(key));
			}
		}
		
		
		
		
		
		
		
	}

}

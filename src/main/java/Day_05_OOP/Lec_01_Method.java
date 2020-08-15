package Day_05_OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lec_01_Method {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> obj4 = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);

		ArrayList<Integer> obj2 = new ArrayList<Integer>();
		obj2.add(4);
		obj2.add(5);
		obj2.add(6);

		ArrayList<Integer> obj3 = new ArrayList<Integer>();
		obj3.add(6);
		obj3.add(7);
		obj3.add(8);

		obj4.add(obj1);
		obj4.add(obj2);
		obj4.add(obj3);

		Integer r = 0;
		while (r < obj4.size()) {
			List<Integer> R = obj4.get(r);

			Integer c = 0;
			while (c < R.size()) {
				System.out.print(R.get(c));
				c++;
			}
			System.out.println();
			r++;
		}

	}

}

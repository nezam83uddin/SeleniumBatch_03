package Day_07;

import java.util.ArrayList;

public class Lec_01_7 {
public static void main(String[] args) {
	ArrayList< String> obj = new ArrayList<String>();
	obj.add("Karim");
	obj.add("Rahimn");
	obj.add("Khaled");
	obj.add("Fahim");
	
	int count=0;
	for (String myData : obj) {
		if (count!=0) {
			System.out.println(myData);
		}
		count++;
	}
	
	
	
}
}

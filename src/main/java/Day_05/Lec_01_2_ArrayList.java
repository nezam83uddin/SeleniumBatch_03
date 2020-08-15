package Day_05;

import java.util.HashSet;

public class Lec_01_2_ArrayList {
	
	public static void main(String[] args) {
		
		array();
		
		
		
	}
	
	
	public static void arraylist() {
		HashSet<String> list= new HashSet<String>();
		list.add("Nafiz");
		list.add("Ali");
		list.add("Masud");
		list.add("Fahim");
		System.out.println(list.contains("Ali") ? "Found" : "Not Found");
	}
	
	public static void array() {
		String  name = "Arif, Nafiz, Fahim, Masud";
//		String name1=name.trim();
		String [] arr =name.split("\\s");
//		String [] arr = {"Arif","Nafiz", "Fahim", "Masud"};
		String temp;
		
		temp=arr[1];
		arr[1]=arr[3];
		arr[3]=temp;
		for (String f : arr) {
			System.out.println(f);
		}
		
		
	}
	
	public static void swap() {
		int x=43;
		int y=98;
		int temp;
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("X :"+x+ ", Y : "+y);
		
				
		
	}
	
	
	
	
	
	

}

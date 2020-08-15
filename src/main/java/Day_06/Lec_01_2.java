package Day_06;

import java.util.ArrayList;

public class Lec_01_2 extends Lec_01_1{
	
	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<Integer>> arr4 = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		
		ArrayList<Integer> arr3= new ArrayList<Integer>();
		arr1.add(7);
		arr1.add(8);
		arr1.add(9);
		
		arr4.add(arr1);
		arr4.add(arr2);
		arr4.add(arr3);
		
		
		Integer row=0;
		while (row<arr4.size()) {
			ArrayList<Integer> coloums = arr4.get(row);
			Integer col=0;
			while (col<coloums.size()) {
				col++;
			}
			System.out.println();
			row++;
		}
		
		
		
	}
	
	
}

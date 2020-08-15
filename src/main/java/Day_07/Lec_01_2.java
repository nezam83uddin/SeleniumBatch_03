package Day_07;

public class Lec_01_2 {
	
	public static void main(String[] args) {
		int [] A= {1, 3, 5, 6, 7};
		
		
		
		int count=0;
		for (int i : A) {
			if (count!=0 && count!=4) {
				System.out.println(i);
			}
			count++;
		}
	}

}

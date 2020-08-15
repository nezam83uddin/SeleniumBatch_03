package Day_05;

public class Lec_01_1 {
	
	public static void main(String[] args) {
		int n=11;
		boolean flag=false;
		for (int i = 0; i < 10; i++) {
			if (i==n) {
				flag=true;
				break;
			}
		}
		
		if (flag) { // true/false
			System.out.println("data found");
		}else {
			System.out.println("data not found");
		}
		
	}

}

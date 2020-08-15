package Day_03;

public class Lec_01_2_SwitchStatement {

	public static void main(String[] args) {
		String x = "2";
		switch (x) {
		case "1":
			System.out.println("a");
			break;
		case "2":
			System.out.println("b");
			break;
		case "3":
			System.out.println("c");
			break;
		case "4":
			if (x.contains("2")) {
				System.out.println("d");
			} else {
				System.out.println("e");
			}
			break;
		default:
			System.out.println("Nothing");
			break;
		}
		System.out.println("f");
	}

}

package chap03_02;

public class Main2 {

	public static void main(String[] args) {
		int age = 20;
		int month = 5;
		if (age >= 18 && month == 5) {
			System.out.println("18歳以上の5月生まれ ");
		}
		String name ="斎藤";
		if (name.equals("斉藤") || name.equals("斎藤")) {
			System.out.println("私は" + name +"です");
		}
	}
}
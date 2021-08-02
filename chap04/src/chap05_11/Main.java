package chap05_11;

public class Main {

	public static String add(String name, int x) {
		String a = x + name;
		return a;
	}
	// ↑↓列を変更するとオーバーロードが変更される
	public static String add(int x, String name) {
		String a = x + name;
		return a;
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println("10 + 20 = " + add(10, 20));
		System.out.println("10 + 20 + 30 = " + add(10, 20, 30));
	}

}

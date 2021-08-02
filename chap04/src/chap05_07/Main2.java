package chap05_07;

public class Main2 {

	public static void main(String[] args) {
		System.out.println(st_add("数字を", "足します"));
		int ans = add(100, 10);
		System.out.println("100 + 10 =" + ans);
		System.out.println(st_add("数字を", "引きます"));
		ans = sub(100, 10);
		System.out.println("100 - 10 =" + ans);
		System.out.println(st_add("数字を", "掛けます"));
		ans = mul(100, 10);
		System.out.println("100 * 10 =" + ans);
		System.out.println(st_add("数字を", "割ります"));
		ans = div(100, 10);
		System.out.println("100 ÷ 10 =" + ans);
		System.out.println(st_add("文字の", "足し算"));
	}

	//	xをy足し算するメソッド
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

	//　xとyを引き算するメソッド
	public static int sub(int x, int y) {
		int ans = x - y;
		return ans;
	}

	//	xとyを掛け算するメソッド
	public static int mul(int x, int y) {
		int ans = x * y;
		return ans;
	}

	//	xとyを割り算するメソッド
	public static int div(int x, int y) {
		int ans = x / y;
		return ans;
	}

	//	xとyを文字入力するメソッド
	public static String st_add(String x, String y) {
		String ans = x + y;
		return ans;
	}

}

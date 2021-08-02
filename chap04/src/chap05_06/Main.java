package chap05_06;

public class Main {

	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add(x, y);
		st_add("数字を", "足します");
		sub(x, y);
		st_add("数字を", "掛けます");
		mul(x, y);
		st_add("数字を", "割ります");
		div(x, y);
		st_add("文字を", "足します");
	}
//	xとyを足し算するメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
//	xとyを引き算するメソッド
	public static void sub(int x, int y) {
		int ans = x - y;
		System.out.println(x + "-" + y + "=" + ans);
	}
//	xとyを掛け算するメソッド
	public static void mul(int x, int y) {
		int ans = x * y;
		System.out.println(x + "*" + y + "=" + ans);
	}
//	xとyを割り算するメソッド
	public static void div(int x, int y) {
		int ans = x / y;
		System.out.println(x + "÷" + y + "=" + ans);
	}
//	文字列のxをy足し算するメソッド
	public static void st_add(String x, String y) {
		String ans = x + y;
		System.out.println(x + y);
	}

}

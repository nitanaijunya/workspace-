package chap05_08;

public class Main {

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;

	}
	public static void main(String[]atgs) {
		System.out.println(add(add(10,20),add(30,40)));
		//	add(10+20),add(30+40)=add(30),add(70)
		//						add(30+70)
	}

}

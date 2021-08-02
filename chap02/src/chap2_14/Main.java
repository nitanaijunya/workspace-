package chap2_14;

public class Main {

	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		System.out.println("サイコロを振ります");
		int d = new java.util.Random().nextInt(6) + 1;
		System.out.println("出た目は" + d +"です");
	}

}

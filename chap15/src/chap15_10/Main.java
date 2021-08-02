package chap15_10;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//ここで何らかの時間がかかる処理
		for(int i = 0; i < 1000000000 ;i++) {
		}
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");
		System.out.println(start);
	}

}

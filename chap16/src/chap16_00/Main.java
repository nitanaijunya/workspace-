package chap16_00;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//配列を準備
		String[] names = new String[3];

		//3人を追加
		names[0] = "たなか";
		names[1] = "すずき";
		names[2] = "さいとう";

		System.out.println(names[1]);

		//ArrayListを準備
		ArrayList<String> names2 =
				new ArrayList<>();
		//3人を追加
		names2.add("たなか");
		names2.add("すずき");
		names2.add("さいとう");
		System.out.println(names2.get(2000));

	}

}

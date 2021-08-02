package chap08_17;

public class King {

	public void contact(Hero h) {
		System.out.println("城に訪れた。");
		System.out.println("勇者よ、よくぞ参った。");

		if(h.grade <= 50) {
			System.out.println("もっと依頼を受けてきなさい！");
		}else {
			System.out.println("魔王を倒してこい！");
		}
	}
}

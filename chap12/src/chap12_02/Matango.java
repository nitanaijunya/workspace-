package chap12_02;

public class Matango {
	int hp = 50;

	public void attack(Hero h) {
		System.out.println("キノコ"  + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;

	}
}

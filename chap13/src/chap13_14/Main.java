package chap13_14;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setHp(100);
		h.setName("ミナト");

		Wand wand = new Wand();
		wand.setName("樫の杖");
		wand.setPower(1.2);

		Wizard w = new Wizard();
		w.setHp(80);
		w.setMp(30);
		w.setName("ポップ");
		w.setWand(wand);

		w.heal(h);

	}

}

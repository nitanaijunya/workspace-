package chap10_12;

public class PoisonMatango extends Matango {
	int poisoncount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		for(;this.poisoncount > 0;this.poisoncount--) {
			System.out.println("毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "のダメージ！");

		}
	}

}

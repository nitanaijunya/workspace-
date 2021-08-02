package chap10_09;

public class SuperHero extends Hero{
	boolean flying;
	//飛ぶ

	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
		super.attack(m);
		}
	}
}

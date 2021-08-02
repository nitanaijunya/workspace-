package chap10_03;

public class Main {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		sh.attack(m);
		m.run();
		sh.run();
		}

}

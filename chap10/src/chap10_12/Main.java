package chap10_12;

public class Main {

	public static void main(String[] args) {
		PoisonMatango pm = new PoisonMatango('A');
		Hero h = new Hero();
		pm.attack(h);
		System.out.println(h.name + "のHPは" + h.hp);
	}

}

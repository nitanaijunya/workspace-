package chap12_10;

public class Main {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[4];
		monsters[0] = new Slime();
		monsters[1] = new Matango();
		monsters[2] = new DeathBat();
		monsters[3] = new Goblin();

		for(Monster m : monsters) {
			m.run();
		}

	}

}

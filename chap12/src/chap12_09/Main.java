package chap12_09;

public class Main {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[2];
		monsters[0] = new Slime();
		monsters[1] = new Matango();
		for(Monster m : monsters) {
			m.run();
		}

	}

}

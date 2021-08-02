package chap16_09;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Hero hero1 = new Hero("鈴木");
		Hero hero2 = new Hero("斉藤");
		ArrayList<Hero> heros = new ArrayList<Hero>();
		heros.add(hero1);
		heros.add(hero2);
		for(Hero i : heros) {
			System.out.println(i.getName());
		}


	}

}

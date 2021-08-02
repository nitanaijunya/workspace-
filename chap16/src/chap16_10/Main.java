package chap16_10;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Hero hero1 = new Hero("鈴木");
		Hero hero2 = new Hero("斉藤");
		Map<Hero,Integer> heros = new HashMap<Hero,Integer>();
		heros.put(hero1,7);
		heros.put(hero2,3);
		for(Hero key : heros.keySet()) {
			int h = heros.get(key);
			System.out.println(key.getName() + "の人口は、" + h);

		}

	}

}

package chap08_17;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		King k = new King();
		h.name = "ミナト";
		h.hp = 100;
		h.gold = 100;
		h.grade = 200;
		//城に行くイベント
		k.contact(h);
	}

}

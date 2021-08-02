package chap11_09;

public class Main {

	public static void main(String[] args) {
		Dancer  d = new Dancer();
		Matango m = new Matango('A');
		d.name = "マーニャ";
		d.dance();
		d.attack(m);

	}

}

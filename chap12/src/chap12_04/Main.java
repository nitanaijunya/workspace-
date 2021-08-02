package chap12_04;

public class Main {

	public static void main(String[] args) {
	 Matango m = new Matango();
	 Character c = new Wizard();//魔法使いキャラを代入
	 c.name = "アサカ";
	 c.attack(m);
//	 c.fireball(m); Characterにあるメソッドのみ実行可

	}
}

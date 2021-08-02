package chap9_03;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damege = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		//swordフィールドに剣インスタンス情報を代入
		System.out.println("現在の武器は" + h.sword.name);
		System.out.println(h.sword.damege);
	}

}

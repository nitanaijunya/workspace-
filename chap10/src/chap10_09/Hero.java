package chap10_09;

public class Hero {
	String name = "ミナト";
	int hp = 100;
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
			System.out.println("10ポイントのダメージをあたえた!");
	}
	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
}

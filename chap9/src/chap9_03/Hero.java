package chap9_03;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は、攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
}

package chap13_06;

public class Hero {
	private int hp;
	String name;
/*	Sword sword;

	public void bye() {
		System.out.println("勇者は別れを告げた！");
	}
*/
	private void dei() {
		System.out.println(this.name + "勇者は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
/*
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
		System.out.println("お化けキノコ" + m.suffix + "から、2ポイントのダメージを受けた");
		this.hp -= 2;
	}
	if(this.hp <= 0) {
		this.die();
	}
*/
}

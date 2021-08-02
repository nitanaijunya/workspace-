package chap08_16;

import java.util.Random;

public class Cleric {
		Cleric C;
		String name;
		int hp = 50;
		final int MAXHP = 50;
		int mp = 10;
		final int MAXMP = 10;

	public void selfAid() {
		System.out.println(this.name  + "はセルフエイドを唱えた！");
		this.hp = this.MAXHP;
		this.mp -= 5;
		System.out.println( this.name + "はHPを" + this.MAXHP + "回復した！");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った！");
		//論理上の回復量を乱数を用いて決定する
		int kaihuku = new Random().nextInt(3) + sec;
		//実際の回復量を計算する
		int recoverActual = Math.min(this.MAXMP - this.mp,kaihuku);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した" );
		return recoverActual;

	}
}
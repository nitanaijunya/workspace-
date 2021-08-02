package chap10_05;

public class SuperHero extends Hero{
	boolean flying;
	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {//Heroクラスのrun（）を再定義
		System.out.println(this.name + "は、撤退した");
	}
	public void slip() {
		this.hp -= 10;
		System.out.println(this.name + "は、転倒した！");
		System.out.println("10のダメージ！");
	}
}

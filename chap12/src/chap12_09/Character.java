package chap12_09;

public abstract class Character {
	String name;
	int hp;
	public void run() {
		System.out.println("スライムはササッと逃げ出した！");
	}
	public abstract void attack(Monster m) ;
}

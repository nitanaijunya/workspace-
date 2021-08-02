package chap12_06;

public abstract class Character {
	String name;
	int hp;
	public void run() {
		System.out.println("スライムはササッと逃げ出した！");
	}
	public abstract void attack() ;
}

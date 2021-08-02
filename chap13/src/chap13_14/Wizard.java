package chap13_14;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int gethp() {
		return this.hp;
	}
	public int getmp() {
		return this.mp;
	}
	public String getName() {
		return this.name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setHp(int hp) {
		this.hp = hp;
		if (hp <= 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public void setMp(int mp) {
		if (mp <= 0) {
			throw new IllegalArgumentException("MPが０以下である。");
		}
		this.mp = mp;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が3文字未満である。処理を中断。");
		}
		this.name = name;
	}
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖がnullです。");
		}
		this.wand = wand;
	}
	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

}

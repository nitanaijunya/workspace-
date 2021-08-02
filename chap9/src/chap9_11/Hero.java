package chap9_11;

public class Hero {
	String name;
	int hp;
	public Hero(String name) { //引数として文字列を1受け取る
		this.hp = 100;
		this.name = name; //引数の値でnameフィールドを初期化
	}
	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
}
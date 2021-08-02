package chap11_17;

public interface Human extends Creature {
	//フィールドはない

	void talk();
	void watch();
	void hear();
	//更に親interfaceからrun()を継承する
}

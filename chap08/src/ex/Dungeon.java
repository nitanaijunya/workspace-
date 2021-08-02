package ex;

public class Dungeon {
	public void collecting(Hero h,Bar bar) {
		if(bar.quest_flag && !bar.quest_clear) {
		System.out.println("ドラゴンの場所に到着した。");
		if(bar.quest==3) {
			h.hp -= 40;
			System.out.println("ドラゴンを倒した！");
			System.out.println("HPが40減った！");
			bar.quest_clear = true;
		}
	}
}

}

package ex;

public class Mountain {
	public void collecting(Hero h,Bar bar) {
			if(bar.quest_flag && !bar.quest_clear) {
			System.out.println("ゴブリンの洞窟に到着した。");
			if(bar.quest==2) {
				h.hp -= 30;
				System.out.println("ゴブリンを倒した！");
				System.out.println("HPが30減った！");
				bar.quest_clear = true;
			}
		}
	}

	}



package chap08_17;

public class Mori {
	public void yakusou(Hero h,Bar bar) {
		System.out.println("森に到着した。");
			if(bar) {
				System.out.println("失敗しました。");
				h.hp -= 20;
			}else {
			System.out.println("成功しました");
			}
	}
}

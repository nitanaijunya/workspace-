package chap15_18;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
		//	sb.append(i + 1 + ","); 結合がおそくなるため。↓で入力
			sb.append(i + 1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split("[,]");
		for(int d = 0; d < 100; d++) {
			System.out.println(a[d]);
		}

	}

}

package chap15_06;

public class Main {

	public static void main(String[] args) {
		if(!isValidPlayerName("MINATO01")) {
			System.out.println("最初はA～Z、2文字目から8文字まではA～Zと0～9で入力してください。");
		}else {
			System.out.println("正しく入力されました。");
		}
/*		System.out.println("Java".matches("J.va"));
		System.out.println("Jaaaaava".matches("Ja*va"));
		System.out.println("あいうxx019".matches(".*"));
		System.out.println("Jva".matches("Ja*va"));
		String s = "Ma def ful";
		System.out.println(s.matches("Ma.*"));
		System.out.println(s.matches(".*ful"));*/
		System.out.println("Jaaava".matches("Ja{3}va"));
	}
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9][7]");
	}

}

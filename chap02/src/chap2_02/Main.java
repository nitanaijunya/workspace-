package chap2_02;

public class Main {
	public static void main(String[] args) {
		System.out.println("私の好きな記号は二重引用符（\")です");
//		int a= 0;
//		a += 2;
		int a = 10;
		int b = 5;
		int c = 7;
		int ans = a + b * c - a - c + 12;
		//				5*7
		//				a + 35 - a - c + 12
		//					45 - a - c + 12
		//
		System.out.println(ans);
 	}
}

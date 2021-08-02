package chap2_15;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("1つ目の数字を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("2つ目の数字を入力してください");
		int b = new java.util.Scanner(System.in).nextInt();
		int awe = (age + b);
		System.out.println(age + "+" + b + "=" + awe );

	}

}

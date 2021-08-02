package chap04_20;

public class Main2 {

	public static void main(String[] args) {
		int[] numbers = {3,4,9};
		System.out.println("1桁の文字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
	//	for(int n : numbers) {
	//		if(n == input) {
	//			System.out.println("アタリ");
	//		}
			for(int  i = 0; i < numbers.length; i++) {
				if( input == numbers[i]) {
				System.out.println("アタリ");
				}
			}
	}
}

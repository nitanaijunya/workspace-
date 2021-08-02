package chap03_01;

public class Main {

	public static void main(String[] args) {
		boolean tenki = false;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		}else {
			System.out.println("DVDを見ます");

		}
		int height = 160;
		char size;
		if (height >= 170) {
			 size = 'L';
		}else if (height >= 155) {
			 size ='M';
		}else if (height >= 140) {
			 size = 'S';
		}else {
			 size = '?';
		}
		System.out.println("あなたの服は" + size + "です");
	}
}

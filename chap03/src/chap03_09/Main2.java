package chap03_09;

public class Main2 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			if(i == 3 ) {
				break;
			}
			System.out.println(i);
		}
		for(int i = 1; i < 10; i++) {
				if(i == 3 ) {
					continue;
				}
				System.out.println(i);
		}
	}

}

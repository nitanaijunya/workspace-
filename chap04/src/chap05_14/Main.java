package chap05_14;

public class Main {

	public static int[] makeArray(int size) {
		int[] newArray = new int[size];//↓のint[] arrayに代入される
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] array = makeArray(3);//↑のsizeに3が代入
		for(int i : array) {
			System.out.println(i);
		}

	}

}

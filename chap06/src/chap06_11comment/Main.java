package chap06_11comment;

public class Main {

	public static void test(int[] array) {
		int[] array2 = {5,8,10};
		array = array2;

	}
	public static void main(String[] args){
		int[] array = {2,6,9};
	test(array);
	System.out.println(array[1]);
	}
	}
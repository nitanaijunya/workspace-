package chap17_03;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
		} catch (IOException e) {
		System.out.println("何らかの例外が発生しました");
		}

	}

}
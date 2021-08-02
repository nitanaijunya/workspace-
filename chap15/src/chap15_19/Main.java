package chap15_19;

public class Main {

	public static void main(String[] args) {
		String folder = "c:\\javavdev";
		String file = "readme.txt";
		Main main = new Main();

		String path = main.concatPath(folder,file);
		System.out.println(path);
	}
	public String concatPath(String folder,String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";

		}
		return folder + file;
	}

}

package chap15_08;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]","X");
		System.out.println(w); //axc.dxf:gxi
		System.out.println(s); //abc.def:ghi
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("Java").append("world");
		System.out.println(sb);
	}

}

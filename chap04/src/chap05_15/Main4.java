package chap05_15;

public class Main4 {

	public static void main(String[] args) {
		double gh = calcTriangleArea(10.0,5.0);
		double gg = calcCircleArea(5);
		System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は" +  gh + "㎠");
		System.out.println("円の半径が5.0cmの場合、面積は" + gg + "㎤");

	}
	public static double calcTriangleArea (double bottom,double height) {
		bottom = 10.0;
		height = 5.0;
		double sankaku = (bottom * height /2);
		return sankaku;
	}
	public static double calcCircleArea(double radius) {
		radius = 5;
		double ritu = 3.14;
		double en = (radius * radius * ritu);
		return en;
	}

}

//public static double calcTriangleArea (double bottom,double height) {
//	return bottom * height / 2;
//	}

// public static double calcCircleArea(double radius) {
//	return Math.PI * Math.pow(radius.2);
//	}

package chap11_21;

public class Main {

	public static void main(String[] args) {
		TangibleAsset ta = new TangibleAsset("本",3000,"紫");
		ta.setWeight(5);
		System.out.println(ta.getWeight());
		System.out.println(ta.getName());
		System.out.println(ta.getColor());

	}

}

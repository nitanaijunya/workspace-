package chap13_14;

public class Wand {
	private String name;
	private double power;
	public void setPower(double power) {
		this.power = power;
		if(power < 0.5 || power > 100.0 ) {
		throw new IllegalArgumentException
		("杖の増幅率が以上です");
		}
	}
	public void setName(String name) {
		this.name = name;
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が3文字未満である。処理を中断。");
		}
	}

	public String getname(String name) {
		return name;
	}
	public double getPower() {
		return power;
	}


}

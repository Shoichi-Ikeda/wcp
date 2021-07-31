public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) { //杖の名前は3文字以上
			throw new IllegalArgumentException("杖に設定されようとしている名前が異常です。");
		}
		this.name = name;
	}
	
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100) { //杖による増幅率は0.5以上100以下
			throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です。");
		}
		this.power = power;
	}
}

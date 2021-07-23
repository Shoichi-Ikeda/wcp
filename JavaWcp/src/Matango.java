public class Matango {
	int hp = 50; //HPの変数宣言
	final int LEVEL = 10; //フィールドを定数として宣言し、初期値も設定
	char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	public void run() {
		System.out.println("おばけキノコ" + this.suffix + "は、逃げ出した！");
	}
}

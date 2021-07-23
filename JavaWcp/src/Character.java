//抽象クラスとしてcharacterを宣言→newによるインスタンス化の禁止
public abstract class Character {
	String name;
	int hp;
	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	//戦うの抽象メソッドを宣言   
	public abstract void attack(Matango m);
}

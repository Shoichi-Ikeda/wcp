//Heroクラスを継承してSuperHeroを作成する
public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった！");
	}
	//親クラスのattackを呼び出す
	public void attack() {
		super.attack(); //親インスタンス部分のattack()を呼び出し
		if (this.flying) {
			super.attack();
		}
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	//SuperHeroクラスにrun()を再定義する
	public void run() { //親クラスにも定義してあるが、小クラスで再定義するメソッド
		System.out.println(this.name + "は撤退した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした。");
	}
}

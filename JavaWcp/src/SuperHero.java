//Heroクラスを継承してSuperHeroを作成する
public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	//SuperHeroクラスにrun()を再定義する
	public void run() { //親クラスにも定義してあるが、小クラスで再定義するメソッド
		System.out.println(this.name + "は撤退した！");
	}
}

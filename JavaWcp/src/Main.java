public class Main {
	public static void main(String[] args) {
		//剣を装備した勇者を生み出す
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		//1.勇者を生成
		Hero h = new Hero("蓮丞"); //インスタンス生成後、JVMがコンストラクタを呼び出す際に「蓮丞」を渡してもらえる
		//2.フィールドに初期値をセット
		//h.name = "レンスケ"; //変数hのnameに代入
		h.sword = s; //swordフィールドに生成済みの剣インスタンス(の番地)を代入
		System.out.println("勇者" + h.name + "を生み出しました！");
		System.out.println("現在の武器は" + h.sword.name);
		
		//SuperHero生成
		SuperHero sh = new SuperHero();
		sh.sword = s;
		System.out.println("勇者" + sh.name + "を生み出しました！");
		System.out.println("現在の武器は" + sh.sword.name);

		//おばけキノコA(1匹目)を生成し初期化
		Matango m1 = new Matango('A');
		//おばけ毒キノコB(2匹目)を生成し初期化
		PoisonMatango m2 = new PoisonMatango('B');
		
		//冒険の始まり
		h.slip(); //勇者は転ぶ
		h.attack();
		sh.fly();
		sh.attack();
		m1.attack(h);
		m2.attack(sh);
		m1.run(); //おばけキノコAが逃げる
		m2.run(); //おばけキノコBも逃げる
		h.run(); //勇者も逃げる
		sh.run();
	}
}

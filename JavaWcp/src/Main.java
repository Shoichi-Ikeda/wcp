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
		
		Matango m1 = new Matango(); //おばけキノコA(1匹目)を生成し初期化
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango(); //おばけキノコB(2匹目)を生成し初期化
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険の始まり
		h.slip(); //勇者は転ぶ
		h.attack();
		m1.run(); //おばけキノコAが逃げる
		m2.run(); //おばけキノコBも逃げる
		h.run(); //勇者も逃げる
		//おばけキノコよ、この仮想空間に生まれよ！
		//勇者よ、戦え！
		//おばけキノコよ、逃げろ！
	}
}

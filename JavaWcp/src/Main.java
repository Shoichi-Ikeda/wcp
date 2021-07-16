public class Main {
	public static void main(String[] args) {
		//1.勇者を生成
		Hero h = new Hero(); //Heroクラスからインスタンスを生成し、変数hに入れる
		//2.フィールドに初期値をセット
		h.name = "レンスケ"; //変数hのnameに代入
		h.hp = 100; //変数hのhpに代入
		System.out.println("勇者" + h.name + "を生み出しました！");
		//3.勇者のメソッドを呼び出してゆく
		h.sit(5); //5秒座れ
		h.slip(); //転べ
		h.sit(25); //25秒座れ
		h.run(); //逃げろ
		//おばけキノコよ、この仮想空間に生まれよ！
		//勇者よ、戦え！
		//おばけキノコよ、逃げろ！
	}
}

public class Hero extends Character {
	//属性の定義
	protected String name; //名前の変数宣言
	protected int hp; //HPの変数宣言
	Sword sword; //勇者が装備している剣の情報
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
	}
	
	public void attack() {
		System.out.println(this.name + "は" + sword.name +"で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	void sleep() { //package privateを指定したとみなされる
		this.hp = 100; //自分自身のhpフィールド
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) { //何秒座るか引数で受け取る
		this.hp += sec; //座る秒数だけHPを増やす
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}
	public final void slip() { //finalがついているメソッドは小クラスでオーバーライド禁止
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした。");
	}
	private void die() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
	}
	/*
	//newされた直後に自動に実行される処理を書いたメソッド(コンストラクタ①)
	public Hero(String name) { //引数として文字列を1つ受け取る
		this.hp = 100;
		this.name = name; //引数の値でnameフィールドを初期化
	}
	*/
	//コンストラクタ②
	public Hero() { //新しく作ったコンストラクタ
		// this("ダミー"); //コンストラクタ①を呼び出すようJVMに依頼する
	}
}

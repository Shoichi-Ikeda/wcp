public class Human01 {
	public String name;//メンバー変数
	public int age;//メンバー変数
	//引数なしのコンストラクタを定義
	public Human01() {
		name = "山田";
		age = 20;
	}
	//引数2つ(String型,int型)のコンストラクタを定義
	public Human01(String name, int age) {
		//nameもageも引数として渡した値で初期化される
		this.name = name;
		this.age = age;
		//初期化対象は生成したインスタンスのメンバー変数なので、thisキーワードを用いて指定する
	}
}

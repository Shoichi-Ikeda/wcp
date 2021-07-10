//引数の例(渡す値が1つの場合)
public class Method03 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します。");
		hello("蓮丞"); //"蓮丞"を渡してhelloメソッドを呼び出す
		hello("優海"); //"優海"を渡してhelloメソッドを呼び出す
		hello("翔一"); //"翔一"を渡してhelloメソッドを呼び出す
		System.out.println("メソッドの呼び出しが終わりました。");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは！");
	}
}

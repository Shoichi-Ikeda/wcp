//引数の例(渡す値が複数の場合)
public class Method04 {
	public static void main(String[] args) {
		add(100, 20); //100 と 20 を渡してaddメソッドを呼び出す
		add(200, 50); //200 と 50 を渡してaddメソッドを呼び出す
	}
	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}

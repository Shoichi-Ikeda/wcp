/*
 * ☆基本型の変数をメソッド呼び出しで渡すと…
 * ①呼び出し元の変数の内容が、呼び出し先の引数にコピーされる。
 * ②呼び出し先で引数の内容を書き換えても、呼び出し元の変数は変化しない。
 * ☆配列をメソッド呼び出しで渡すと…
 * ①呼び出し元の配列のアドレスが、呼び出し先の引数にコピーされる。
 * ②呼び出し先で配列の実体を書き換えると、呼び出し元にも影響する。
 */
// 同じ配列を参照していることを参照する
public class Method07 {
	//int型配列を受け取り、配列内の要素全てに 1 を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
		array[i]++; 
		//結果を return で返していない
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array); //メソッド実行
		//array の全要素を出力
		for (int i : array) {
			System.out.println(i);
		}
	}
}

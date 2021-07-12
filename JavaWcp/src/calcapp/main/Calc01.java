package calcapp.main; //パッケージの名前はアルファベットの小文字使用が一般的
import calcapp.logics.CalcLogic01; // import文→FQCNの記述を省略して手間を軽減するための構文
// import calcapp.logics.*; // calcapp.logicsの全クラスをインポートする
/*
 * import calcapp.*;
 * ↑↑↑ではcalcapp.mainとcalcapp.logicsに所属する全てのクラスを一度にインポートできない
 * ↓↓↓calcapp.mainとcalcapp.logicsに所属する全てのクラスを一度にインポートしたい場合
 * import calcapp.main.*;
 * import calcapp.logics.*;
 */
public class Calc01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic01.tasu(a,b);
		int delta = calcapp.logics.CalcLogic01.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}

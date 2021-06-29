//文字列の等価比較
public class Mathmatic07 {
	public static void main(String[] args) {
		String a = "applePie";
		String b = "applePie";
		boolean c;
		c = a == b;
		System.out.println(c);
		//一般的に文字列比較をしたい際に == を使うのは避ける。
		
		String d = "apple";
		String e = d + "Pie";
		System.out.println(e);
		c = a == e;
		System.out.println(c);
		
		String f = new String("applePie");
		c = a == f;
		System.out.println(c);
		
		/*
		 *  == 演算子は、参照しているオブジェクトが一致しているかをチェックする。
		 * 変数 e や f は、a と中身が同じ別のオブジェクトを生成しているため、結果がfalseとなる。
		 * 代わりに、文字列を比較したい場合は、equalsメソッドを使う。
		*/
		
		c = a.equals(b);
		System.out.println(c);
		c = a.equals(e);
		System.out.println(c);
		c = a.equals(f);
		System.out.println(c);
	}
}

//正規表現の基本文法
public class Valid {
	public static void main(String[] args) {
		String a = "AB";
		String b = "ABBB";
		String c = "ABBC";
		String d = "ABCD123";
		String j = "joyful";
		String m = "Mathmaric";
		String s = "Java";
		String t = "Jaaaaaaava";
		String u = "URL";
		//①通常文字:その文字でなければならない
		System.out.println("①");
		System.out.println(s.matches("Java"));
		System.out.println(s.matches("JavaJava"));
		System.out.println(s.matches("java"));
		//②ピリオド:任意の1文字であれば良い
		System.out.println("②");
		System.out.println(s.matches("J.va"));
		System.out.println(s.matches("J..a"));
		//③アスタリスク:直前の文字の0回以上の繰り返し
		System.out.println("③");
		System.out.println(a.matches("AB*"));
		System.out.println(b.matches("AB*"));
		System.out.println(c.matches("AB*C"));
		//任意の1文字を0回以上繰り返す
		System.out.println(d.matches(".*"));
		System.out.println(j.matches(".*ful"));
		System.out.println(m.matches("Ma.*"));
		//④波括弧{}:指定回数の繰り返し
		System.out.println("④");
		System.out.println(b.matches("AB{3}")); //3回の繰り返し
		System.out.println(t.matches("Ja{4,}va")); //4回以上の繰り返し
		System.out.println(t.matches("Ja{5,8}va")); //5回以上8回以下の繰り返し
		//⑤角括弧[]:いずれかの文字
		System.out.println("⑤");
		System.out.println(u.matches("UR[LMN]"));
		//⑥角括弧内のハイフン:指定範囲のいずれかの文字
		System.out.println("⑥");
		System.out.println(u.matches("[A-Z]{3}"));
	}
}

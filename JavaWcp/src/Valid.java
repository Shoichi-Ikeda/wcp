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
	}
}
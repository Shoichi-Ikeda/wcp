//正規表現の基本文法
public class Valid {
	public static void main(String[] args) {
		String s = "Java"; 
		//その文字でなければならない
		System.out.println(s.matches("Java"));
		System.out.println(s.matches("JavaJava"));
		System.out.println(s.matches("java"));
	}
}

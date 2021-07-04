//インクリメント・デクリメント演算子
public class Mathmatic02 {
	public static void main(String[] argas) {
		int a;
		a = 10;
		a++;
		System.out.println(a);
		
		a = 10;
		a--;
		System.out.println(a);
		
		//前置と後置
		int b;
		int c;
		b = 5;
		//　b　をインクリメントした後に　b　が　c　に代入される
		c = ++b;
		// それぞれの値は　b　が「6」で　c　も「6」
		System.out.println(b);
		System.out.println(c);
		//　b　を　c　に代入した後に　b　がインクリメントされる
		b = 5;
		c = b++;
		// それぞれの値は　b　が「6」で　c　が「5」
		System.out.println(b);
		System.out.println(c);
		
		int d = 10;
		int e = 10;
		System.out.println(++d + 50);
		System.out.println(e++ + 50);
	}
}

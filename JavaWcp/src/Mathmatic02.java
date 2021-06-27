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
		//bをインクリメントした後にaがcに代入される
		c = ++b;
		System.out.println(b);
		System.out.println(c);
		//bをcに代入した後にaがインクリメントされる
		b = 5;
		c = b++;
		System.out.println(b);
		System.out.println(c);
	}
}

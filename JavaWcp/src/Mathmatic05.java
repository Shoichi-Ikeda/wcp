//論理演算子
public class Mathmatic05 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c;
		
		c = a && true;
		System.out.println(c);
		c = a && false;
		System.out.println(c);
		c = b || true;
		System.out.println(c);
		c = b || false;
		System.out.println(c);
		c = !a;
		System.out.println(c);
		c = !b;
		System.out.println(c);
	}
}

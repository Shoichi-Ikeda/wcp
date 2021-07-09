// mainメソッド以外からメソッドを呼び出す
public class Method02 {
	public static void methodA() {
		System.out.println("methodA");
		methodB(); //methodBの呼び出し
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA(); //methodAの呼び出し
	}
}

//Overload(多重定義)
public class Overload01 {
	//1つ目のメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	//2つ目のメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	//3つ目のメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	public static void main(String[] args) {
		System.out.println(add(10, 20)); //1つ目のaddメソッドが呼び出される
		System.out.println(add(3.4, 5.6)); //2つ目のaddメソッドが呼び出される
		System.out.println(add("Hello", "World")); //3つ目のメソッドが呼び出される
	}
}

//ランダムな数を生成する命令
public class Random {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分" + r + "歳ですね。");
	}
}

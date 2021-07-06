//あえてbreak文を書かない
public class Fortune03 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
			case 1:
			case 2:
				System.out.println("いいね！");
			case 3:
				System.out.println("普通です");
			case 4:
			case 5:
				System.out.println("うーん…");
		}
	}
}

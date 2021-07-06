public class Doorclose {
	public static void main(String[] args) {
		// boolean doorClose = true; //無限ループ
		boolean doorClose = false;
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
	}
}
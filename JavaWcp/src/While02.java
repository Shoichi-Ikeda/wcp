public class While02 {
	public static void main(String[] args) {
		int temp = 30;
		while (temp > 25) {
			System.out.println("今の設定温度は" + temp + "度です。" );
			System.out.println("温度を1度下げます。");
			temp--;
			System.out.println("設定温度は" + temp + "度です。");
		}
	}
}

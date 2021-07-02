public class Age02 {
	public static void main(String[] arg) {
		int age = 20; //変数ageを20で初期化
		System.out.println("私の年齢は" + age + "歳です");
		age = 31; //変数ageに再度代入
		System.out.println("いや、本当の年齢は" + age + "歳です");
		/*すでに値が入っている変数に代入すると
		 *古い値は消滅し、新しい値に内容が書き換わる
		 */
	}
}
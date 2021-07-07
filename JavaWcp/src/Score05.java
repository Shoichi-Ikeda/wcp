// カウント集計
public class Score05 {
	public static void  main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60};
		int count = 0; //集計結果を入れるための変数を初期化して準備
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
			count++; // 条件に合致する要素があればカウントする
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
	}
}

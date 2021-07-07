public class Score01 {
	public static void main(String[] args) {
		int[] scores; //int型の要素を代入できる配列変数 scores を用意
		scores = new int[5]; //int型の要素を5つ作成して scores に代入し、配列 scores の完成
		/* 同時作成↓↓↓
		 * int[] scores = new int[5]; 
		 */
		int num = scores.length; // 配列の長さを調べる
		System.out.println("要素の数:" + num);
	}
}

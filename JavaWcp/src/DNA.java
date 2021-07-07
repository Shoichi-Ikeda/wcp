// 添字に対応した情報の利用
public class DNA {
	public static void main(String[] args) {
		int[] seq = new int[10];
		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		//生成した塩基配列の記号の表示
		for (int i = 0; i < seq.length; i++) {
			/*
			switch (seq[i]) {
			case 0:
				System.out.print("A ");
				break;
			case 1:
				System.out.print("T ");
				break;
			case 2:
				System.out.print("G ");
				break;
			case 3:
				System.out.print("C ");
				break;
			}
			↓↓↓シンプルなコードに書き直す↓↓↓
		*/
		char[] base = {'A', 'T', 'G', 'C'};
		//System.out.print(base[seq[i]] + " ");
		// ↓↓↓分解すると…↓↓↓
		int baseType = seq[i]; //i番目の数値を取得
		char baseChar = base[baseType]; //数値に対応する記号を取得
		System.out.print(baseChar + " "); //記号を画面に表示
		}
	}
}
